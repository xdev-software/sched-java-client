/*
 * Sched REST API
 * Sched REST API documentation by XDEV Software
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package software.xdev.sched.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Session
 */
@JsonPropertyOrder({
  Session.JSON_PROPERTY_EVENT_KEY,
  Session.JSON_PROPERTY_ACTIVE,
  Session.JSON_PROPERTY_PINNED,
  Session.JSON_PROPERTY_NAME,
  Session.JSON_PROPERTY_EVENT_START,
  Session.JSON_PROPERTY_EVENT_END,
  Session.JSON_PROPERTY_EVENT_TYPE,
  Session.JSON_PROPERTY_DESCRIPTION,
  Session.JSON_PROPERTY_SEATS,
  Session.JSON_PROPERTY_GOERS,
  Session.JSON_PROPERTY_CHECKINS,
  Session.JSON_PROPERTY_INVITE_ONLY,
  Session.JSON_PROPERTY_VENUE,
  Session.JSON_PROPERTY_AUDIENCE,
  Session.JSON_PROPERTY_SUBJECT,
  Session.JSON_PROPERTY_ID,
  Session.JSON_PROPERTY_VENUE_ID,
  Session.JSON_PROPERTY_SPEAKERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Session {
  public static final String JSON_PROPERTY_EVENT_KEY = "event_key";
  private String eventKey;

  /**
   * Gets or Sets active
   */
  public enum ActiveEnum {
    Y("Y"),
    
    N("N");

    private String value;

    ActiveEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActiveEnum fromValue(String value) {
      for (ActiveEnum b : ActiveEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private ActiveEnum active;

  /**
   * Gets or Sets pinned
   */
  public enum PinnedEnum {
    Y("Y"),
    
    N("N");

    private String value;

    PinnedEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PinnedEnum fromValue(String value) {
      for (PinnedEnum b : PinnedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PINNED = "pinned";
  private PinnedEnum pinned;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EVENT_START = "event_start";
  private OffsetDateTime eventStart;

  public static final String JSON_PROPERTY_EVENT_END = "event_end";
  private OffsetDateTime eventEnd;

  public static final String JSON_PROPERTY_EVENT_TYPE = "event_type";
  private String eventType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SEATS = "seats";
  private String seats;

  public static final String JSON_PROPERTY_GOERS = "goers";
  private String goers;

  public static final String JSON_PROPERTY_CHECKINS = "checkins";
  private String checkins;

  /**
   * Gets or Sets inviteOnly
   */
  public enum InviteOnlyEnum {
    Y("Y"),
    
    N("N");

    private String value;

    InviteOnlyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InviteOnlyEnum fromValue(String value) {
      for (InviteOnlyEnum b : InviteOnlyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INVITE_ONLY = "invite_only";
  private InviteOnlyEnum inviteOnly;

  public static final String JSON_PROPERTY_VENUE = "venue";
  private String venue;

  public static final String JSON_PROPERTY_AUDIENCE = "audience";
  private String audience;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VENUE_ID = "venue_id";
  private String venueId;

  public static final String JSON_PROPERTY_SPEAKERS = "speakers";
  private String speakers;

  public Session() {
  }

  public Session eventKey(String eventKey) {
    
    this.eventKey = eventKey;
    return this;
  }

   /**
   * Get eventKey
   * @return eventKey
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventKey() {
    return eventKey;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventKey(String eventKey) {
    this.eventKey = eventKey;
  }


  public Session active(ActiveEnum active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActiveEnum getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(ActiveEnum active) {
    this.active = active;
  }


  public Session pinned(PinnedEnum pinned) {
    
    this.pinned = pinned;
    return this;
  }

   /**
   * Get pinned
   * @return pinned
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PINNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PinnedEnum getPinned() {
    return pinned;
  }


  @JsonProperty(JSON_PROPERTY_PINNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPinned(PinnedEnum pinned) {
    this.pinned = pinned;
  }


  public Session name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public Session eventStart(OffsetDateTime eventStart) {
    
    this.eventStart = eventStart;
    return this;
  }

   /**
   * Get eventStart
   * @return eventStart
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEventStart() {
    return eventStart;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventStart(OffsetDateTime eventStart) {
    this.eventStart = eventStart;
  }


  public Session eventEnd(OffsetDateTime eventEnd) {
    
    this.eventEnd = eventEnd;
    return this;
  }

   /**
   * Get eventEnd
   * @return eventEnd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEventEnd() {
    return eventEnd;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventEnd(OffsetDateTime eventEnd) {
    this.eventEnd = eventEnd;
  }


  public Session eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventType() {
    return eventType;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public Session description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public Session seats(String seats) {
    
    this.seats = seats;
    return this;
  }

   /**
   * Number of seats... as string
   * @return seats
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSeats() {
    return seats;
  }


  @JsonProperty(JSON_PROPERTY_SEATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeats(String seats) {
    this.seats = seats;
  }


  public Session goers(String goers) {
    
    this.goers = goers;
    return this;
  }

   /**
   * Number of goers... as string
   * @return goers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GOERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGoers() {
    return goers;
  }


  @JsonProperty(JSON_PROPERTY_GOERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoers(String goers) {
    this.goers = goers;
  }


  public Session checkins(String checkins) {
    
    this.checkins = checkins;
    return this;
  }

   /**
   * Number of check-ins... as string
   * @return checkins
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECKINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckins() {
    return checkins;
  }


  @JsonProperty(JSON_PROPERTY_CHECKINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckins(String checkins) {
    this.checkins = checkins;
  }


  public Session inviteOnly(InviteOnlyEnum inviteOnly) {
    
    this.inviteOnly = inviteOnly;
    return this;
  }

   /**
   * Get inviteOnly
   * @return inviteOnly
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVITE_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InviteOnlyEnum getInviteOnly() {
    return inviteOnly;
  }


  @JsonProperty(JSON_PROPERTY_INVITE_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInviteOnly(InviteOnlyEnum inviteOnly) {
    this.inviteOnly = inviteOnly;
  }


  public Session venue(String venue) {
    
    this.venue = venue;
    return this;
  }

   /**
   * Get venue
   * @return venue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVenue() {
    return venue;
  }


  @JsonProperty(JSON_PROPERTY_VENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVenue(String venue) {
    this.venue = venue;
  }


  public Session audience(String audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAudience() {
    return audience;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudience(String audience) {
    this.audience = audience;
  }


  public Session subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public Session id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A hexadecimal string
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Session venueId(String venueId) {
    
    this.venueId = venueId;
    return this;
  }

   /**
   * Get venueId
   * @return venueId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VENUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVenueId() {
    return venueId;
  }


  @JsonProperty(JSON_PROPERTY_VENUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVenueId(String venueId) {
    this.venueId = venueId;
  }


  public Session speakers(String speakers) {
    
    this.speakers = speakers;
    return this;
  }

   /**
   * Comma separated list of speakers
   * @return speakers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPEAKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSpeakers() {
    return speakers;
  }


  @JsonProperty(JSON_PROPERTY_SPEAKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpeakers(String speakers) {
    this.speakers = speakers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Session session = (Session) o;
    return Objects.equals(this.eventKey, session.eventKey) &&
        Objects.equals(this.active, session.active) &&
        Objects.equals(this.pinned, session.pinned) &&
        Objects.equals(this.name, session.name) &&
        Objects.equals(this.eventStart, session.eventStart) &&
        Objects.equals(this.eventEnd, session.eventEnd) &&
        Objects.equals(this.eventType, session.eventType) &&
        Objects.equals(this.description, session.description) &&
        Objects.equals(this.seats, session.seats) &&
        Objects.equals(this.goers, session.goers) &&
        Objects.equals(this.checkins, session.checkins) &&
        Objects.equals(this.inviteOnly, session.inviteOnly) &&
        Objects.equals(this.venue, session.venue) &&
        Objects.equals(this.audience, session.audience) &&
        Objects.equals(this.subject, session.subject) &&
        Objects.equals(this.id, session.id) &&
        Objects.equals(this.venueId, session.venueId) &&
        Objects.equals(this.speakers, session.speakers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventKey, active, pinned, name, eventStart, eventEnd, eventType, description, seats, goers, checkins, inviteOnly, venue, audience, subject, id, venueId, speakers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    sb.append("    eventKey: ").append(toIndentedString(eventKey)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    pinned: ").append(toIndentedString(pinned)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    eventStart: ").append(toIndentedString(eventStart)).append("\n");
    sb.append("    eventEnd: ").append(toIndentedString(eventEnd)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
    sb.append("    goers: ").append(toIndentedString(goers)).append("\n");
    sb.append("    checkins: ").append(toIndentedString(checkins)).append("\n");
    sb.append("    inviteOnly: ").append(toIndentedString(inviteOnly)).append("\n");
    sb.append("    venue: ").append(toIndentedString(venue)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    venueId: ").append(toIndentedString(venueId)).append("\n");
    sb.append("    speakers: ").append(toIndentedString(speakers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `event_key` to the URL query string
    if (getEventKey() != null) {
      try {
        joiner.add(String.format("%sevent_key%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEventKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `active` to the URL query string
    if (getActive() != null) {
      try {
        joiner.add(String.format("%sactive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActive()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `pinned` to the URL query string
    if (getPinned() != null) {
      try {
        joiner.add(String.format("%spinned%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPinned()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `event_start` to the URL query string
    if (getEventStart() != null) {
      try {
        joiner.add(String.format("%sevent_start%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEventStart()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `event_end` to the URL query string
    if (getEventEnd() != null) {
      try {
        joiner.add(String.format("%sevent_end%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEventEnd()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `event_type` to the URL query string
    if (getEventType() != null) {
      try {
        joiner.add(String.format("%sevent_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEventType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `seats` to the URL query string
    if (getSeats() != null) {
      try {
        joiner.add(String.format("%sseats%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSeats()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `goers` to the URL query string
    if (getGoers() != null) {
      try {
        joiner.add(String.format("%sgoers%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGoers()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `checkins` to the URL query string
    if (getCheckins() != null) {
      try {
        joiner.add(String.format("%scheckins%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCheckins()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `invite_only` to the URL query string
    if (getInviteOnly() != null) {
      try {
        joiner.add(String.format("%sinvite_only%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInviteOnly()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `venue` to the URL query string
    if (getVenue() != null) {
      try {
        joiner.add(String.format("%svenue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVenue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `audience` to the URL query string
    if (getAudience() != null) {
      try {
        joiner.add(String.format("%saudience%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAudience()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `subject` to the URL query string
    if (getSubject() != null) {
      try {
        joiner.add(String.format("%ssubject%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubject()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `venue_id` to the URL query string
    if (getVenueId() != null) {
      try {
        joiner.add(String.format("%svenue_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVenueId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `speakers` to the URL query string
    if (getSpeakers() != null) {
      try {
        joiner.add(String.format("%sspeakers%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpeakers()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

