package software.xdev;

import java.net.URI;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import software.xdev.sched.api.RoleApi;
import software.xdev.sched.api.SessionApi;
import software.xdev.sched.api.UserApi;
import software.xdev.sched.client.ApiClient;
import software.xdev.sched.model.ExportSession;
import software.xdev.sched.model.Session;
import software.xdev.sched.model.User;
import software.xdev.sched.model.UserAdded;


public final class Application
{
	public static final Logger LOG = LoggerFactory.getLogger(Application.class);
	private static final String LOG_RESPONSE = "Response: {}";
	private static final String TEST_USER = "TestUser" + System.currentTimeMillis() + "_DELETE_ME";
	public static final String SESSION_KEY = "TEST-123" + System.currentTimeMillis() + "_DELETE_ME";
	
	public static void main(final String[] args)
	{
		String apiKey = Optional.ofNullable(System.getenv("API-KEY"))
			.orElseGet(() -> System.getProperty("API-KEY"));
		if(apiKey == null)
		{
			LOG.error("Required API-KEY not set in environment variables or system properties");
			
			LOG.info("Please provide API Key over console:");
			try(final Scanner scanner = new Scanner(System.in))
			{
				apiKey = scanner.nextLine();
			}
			
			if(apiKey == null || apiKey.isBlank())
			{
				LOG.error("Invalid key; Aborting");
				System.exit(1);
			}
		}
		
		try
		{
			final CustomApiClient apiClient = new CustomApiClient(apiKey);
			checkUserAPI(apiClient);
			checkSessionAPI(apiClient);
			checkRoleAPI(apiClient);
		}
		catch(final Exception ex)
		{
			LOG.error("Unexpected problem", ex);
		}
		finally
		{
			LOG.warn("Manual cleanup may be required for user and session (as APIs for complete deletion do not "
				+ "exist)");
		}
	}
	
	private static void checkUserAPI(final CustomApiClient apiClient)
	{
		final UserApi userApi = new UserApi(apiClient);
		
		LOG.info("=== USER: ADD ===");
		final UserAdded userAdded = userApi.addUser(
			TEST_USER,
			// Temporary E-Mail for test may be acquired by e.g. https://temp-mail.org
			"testuser@example.nonexistent",
			null,
			"+49 123 456",
			null,
			"attendee",
			null,
			"The TestUser",
			"Does some integration testing with the API",
			URI.create("https://upload.wikimedia.org/wikipedia/commons/7/70/Example.png"),
			"The internet",
			"IANA",
			"Tester",
			null,
			"0",
			null,
			"Y"
		);
		LOG.info("Added user: {}", userAdded);
		
		LOG.info("=== USER: LIST ===");
		final List<User> users = userApi.listUsers("json", null);
		LOG.info("Users: {}", users);
	}
	
	private static void checkSessionAPI(final CustomApiClient apiClient)
	{
		
		final SessionApi sessionApi = new SessionApi(apiClient);
		LOG.info("=== SESSION: ADD ===");
		final String addSessionResponse = sessionApi.addSession(
			SESSION_KEY,
			"TestSession",
			OffsetDateTime.of(LocalDateTime.of(2030, 1, 1, 14, 0), ZoneOffset.UTC),
			OffsetDateTime.of(LocalDateTime.of(2030, 1, 1, 16, 0), ZoneOffset.UTC),
			"session",
			null,
			"Test session",
			URI.create("https://sched.com/api"),
			"First room",
			null,
			null,
			null,
			null,
			null,
			"N",
			Map.of("extra", "Joppiesauce")
		);
		LOG.info(LOG_RESPONSE, addSessionResponse);
		
		LOG.info("=== SESSION: MODIFY ===");
		final String modifySessionResponse = sessionApi.modifySession(
			SESSION_KEY,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			"Y",
			null
		);
		LOG.info(LOG_RESPONSE, modifySessionResponse);
		
		LOG.info("=== SESSION: LIST ===");
		final List<Session> sessions = sessionApi.listSessions(null, "json", null, null);
		LOG.info("Sessions: {}", sessions);
		
		LOG.info("=== SESSION: EXPORT ===");
		final List<ExportSession> exportSessions =
			sessionApi.exportSessions(null, "json", null, null, null, null, null);
		LOG.info("Sessions: {}", exportSessions);
		
		LOG.info("=== SESSION: \"DELETE\"/DEACTIVATE ===");
		final String deleteResponse = sessionApi.deleteSession(SESSION_KEY);
		LOG.info(LOG_RESPONSE, deleteResponse);
	}
	
	private static void checkRoleAPI(final CustomApiClient apiClient)
	{
		final RoleApi roleApi = new RoleApi(apiClient);
		LOG.info("=== ROLE: ADD ===");
		final String roleAddResponse = roleApi.addRole(TEST_USER, "speaker", null, null);
		LOG.info(LOG_RESPONSE, roleAddResponse);
		
		LOG.info("=== ROLE: \"DELETE\"/REMOVE ===");
		final String roleDeleteResponse = roleApi.deleteRole(TEST_USER, "speaker", null, null);
		LOG.info(LOG_RESPONSE, roleDeleteResponse);
	}
	
	public static class CustomApiClient extends ApiClient
	{
		public CustomApiClient(final String apiKey)
		{
			this.setConnectTimeout(30_000);
			this.setUserAgent("Sched-Java-Client-Demo");
			this.setApiKey(apiKey);
		}
	}
}
