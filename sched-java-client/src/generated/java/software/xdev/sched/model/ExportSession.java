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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import software.xdev.sched.model.ExportSpeaker;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ExportSession
 */
@JsonPropertyOrder({
  ExportSession.JSON_PROPERTY_EVENT_KEY,
  ExportSession.JSON_PROPERTY_ACTIVE,
  ExportSession.JSON_PROPERTY_PINNED,
  ExportSession.JSON_PROPERTY_NAME,
  ExportSession.JSON_PROPERTY_EVENT_START,
  ExportSession.JSON_PROPERTY_EVENT_END,
  ExportSession.JSON_PROPERTY_EVENT_TYPE,
  ExportSession.JSON_PROPERTY_SEATS,
  ExportSession.JSON_PROPERTY_GOERS,
  ExportSession.JSON_PROPERTY_INVITE_ONLY,
  ExportSession.JSON_PROPERTY_VENUE,
  ExportSession.JSON_PROPERTY_ID,
  ExportSession.JSON_PROPERTY_VENUE_ID,
  ExportSession.JSON_PROPERTY_SPEAKERS,
  ExportSession.JSON_PROPERTY_EVENT_TYPE_SORT,
  ExportSession.JSON_PROPERTY_VIDEO_STREAM
})
public class ExportSession {
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
  private String eventStart;

  public static final String JSON_PROPERTY_EVENT_END = "event_end";
  private String eventEnd;

  public static final String JSON_PROPERTY_EVENT_TYPE = "event_type";
  private String eventType;

  public static final String JSON_PROPERTY_SEATS = "seats";
  private String seats;

  public static final String JSON_PROPERTY_GOERS = "goers";
  private String goers;

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

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VENUE_ID = "venue_id";
  private String venueId;

  public static final String JSON_PROPERTY_SPEAKERS = "speakers";
  private List<ExportSpeaker> speakers = new ArrayList<>();

  public static final String JSON_PROPERTY_EVENT_TYPE_SORT = "event_type_sort";
  private String eventTypeSort;

  public static final String JSON_PROPERTY_VIDEO_STREAM = "video_stream";
  private String videoStream;

  public ExportSession() {
  }

  public ExportSession eventKey(String eventKey) {
    
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

  public ExportSession active(ActiveEnum active) {
    
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

  public ExportSession pinned(PinnedEnum pinned) {
    
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

  public ExportSession name(String name) {
    
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

  public ExportSession eventStart(String eventStart) {
    
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

  public String getEventStart() {
    return eventStart;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventStart(String eventStart) {
    this.eventStart = eventStart;
  }

  public ExportSession eventEnd(String eventEnd) {
    
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

  public String getEventEnd() {
    return eventEnd;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventEnd(String eventEnd) {
    this.eventEnd = eventEnd;
  }

  public ExportSession eventType(String eventType) {
    
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

  public ExportSession seats(String seats) {
    
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

  public ExportSession goers(String goers) {
    
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

  public ExportSession inviteOnly(InviteOnlyEnum inviteOnly) {
    
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

  public ExportSession venue(String venue) {
    
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

  public ExportSession id(String id) {
    
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

  public ExportSession venueId(String venueId) {
    
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

  public ExportSession speakers(List<ExportSpeaker> speakers) {
    
    this.speakers = speakers;
    return this;
  }

  public ExportSession addSpeakersItem(ExportSpeaker speakersItem) {
    if (this.speakers == null) {
      this.speakers = new ArrayList<>();
    }
    this.speakers.add(speakersItem);
    return this;
  }

   /**
   * Get speakers
   * @return speakers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPEAKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ExportSpeaker> getSpeakers() {
    return speakers;
  }


  @JsonProperty(JSON_PROPERTY_SPEAKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpeakers(List<ExportSpeaker> speakers) {
    this.speakers = speakers;
  }

  public ExportSession eventTypeSort(String eventTypeSort) {
    
    this.eventTypeSort = eventTypeSort;
    return this;
  }

   /**
   * Numeric string
   * @return eventTypeSort
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventTypeSort() {
    return eventTypeSort;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventTypeSort(String eventTypeSort) {
    this.eventTypeSort = eventTypeSort;
  }

  public ExportSession videoStream(String videoStream) {
    
    this.videoStream = videoStream;
    return this;
  }

   /**
   * Livestream url (url is not validated!). Undocumented
   * @return videoStream
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEO_STREAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVideoStream() {
    return videoStream;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_STREAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoStream(String videoStream) {
    this.videoStream = videoStream;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportSession exportSession = (ExportSession) o;
    return Objects.equals(this.eventKey, exportSession.eventKey) &&
        Objects.equals(this.active, exportSession.active) &&
        Objects.equals(this.pinned, exportSession.pinned) &&
        Objects.equals(this.name, exportSession.name) &&
        Objects.equals(this.eventStart, exportSession.eventStart) &&
        Objects.equals(this.eventEnd, exportSession.eventEnd) &&
        Objects.equals(this.eventType, exportSession.eventType) &&
        Objects.equals(this.seats, exportSession.seats) &&
        Objects.equals(this.goers, exportSession.goers) &&
        Objects.equals(this.inviteOnly, exportSession.inviteOnly) &&
        Objects.equals(this.venue, exportSession.venue) &&
        Objects.equals(this.id, exportSession.id) &&
        Objects.equals(this.venueId, exportSession.venueId) &&
        Objects.equals(this.speakers, exportSession.speakers) &&
        Objects.equals(this.eventTypeSort, exportSession.eventTypeSort) &&
        Objects.equals(this.videoStream, exportSession.videoStream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventKey, active, pinned, name, eventStart, eventEnd, eventType, seats, goers, inviteOnly, venue, id, venueId, speakers, eventTypeSort, videoStream);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportSession {\n");
    sb.append("    eventKey: ").append(toIndentedString(eventKey)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    pinned: ").append(toIndentedString(pinned)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    eventStart: ").append(toIndentedString(eventStart)).append("\n");
    sb.append("    eventEnd: ").append(toIndentedString(eventEnd)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
    sb.append("    goers: ").append(toIndentedString(goers)).append("\n");
    sb.append("    inviteOnly: ").append(toIndentedString(inviteOnly)).append("\n");
    sb.append("    venue: ").append(toIndentedString(venue)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    venueId: ").append(toIndentedString(venueId)).append("\n");
    sb.append("    speakers: ").append(toIndentedString(speakers)).append("\n");
    sb.append("    eventTypeSort: ").append(toIndentedString(eventTypeSort)).append("\n");
    sb.append("    videoStream: ").append(toIndentedString(videoStream)).append("\n");
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
      for (int i = 0; i < getSpeakers().size(); i++) {
        if (getSpeakers().get(i) != null) {
          joiner.add(getSpeakers().get(i).toUrlQueryString(String.format("%sspeakers%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `event_type_sort` to the URL query string
    if (getEventTypeSort() != null) {
      try {
        joiner.add(String.format("%sevent_type_sort%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEventTypeSort()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `video_stream` to the URL query string
    if (getVideoStream() != null) {
      try {
        joiner.add(String.format("%svideo_stream%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVideoStream()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

