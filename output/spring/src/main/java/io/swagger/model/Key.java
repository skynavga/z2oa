package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Key
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-16T11:02:24.642428-05:00[America/Chicago]")


public class Key   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("shortDisplayName")
  private String shortDisplayName = null;

  @JsonProperty("description")
  private String description = null;

  public Key id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "d1f93776-c39c-11ed-afa1-0242ac120002", required = true, description = "")
      @NotNull

    @Valid
    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Key name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "key-1", required = true, description = "")
      @NotNull

  @Pattern(regexp="[a-z][a-z0-9-]+") @Size(min=2,max=64)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Key displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   **/
  @Schema(example = "Key 1", required = true, description = "")
      @NotNull

  @Pattern(regexp="[\\w ,.'()-]+") @Size(min=2,max=256)   public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Key shortDisplayName(String shortDisplayName) {
    this.shortDisplayName = shortDisplayName;
    return this;
  }

  /**
   * Get shortDisplayName
   * @return shortDisplayName
   **/
  @Schema(example = "K1", required = true, description = "")
      @NotNull

  @Pattern(regexp="[\\w ,.'()-]+") @Size(min=2,max=16)   public String getShortDisplayName() {
    return shortDisplayName;
  }

  public void setShortDisplayName(String shortDisplayName) {
    this.shortDisplayName = shortDisplayName;
  }

  public Key description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(example = "Our First Key", required = true, description = "")
      @NotNull

  @Pattern(regexp="[\\w ,.'()-]+") @Size(min=2,max=1024)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Key key = (Key) o;
    return Objects.equals(this.id, key.id) &&
        Objects.equals(this.name, key.name) &&
        Objects.equals(this.displayName, key.displayName) &&
        Objects.equals(this.shortDisplayName, key.shortDisplayName) &&
        Objects.equals(this.description, key.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, displayName, shortDisplayName, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Key {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    shortDisplayName: ").append(toIndentedString(shortDisplayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
