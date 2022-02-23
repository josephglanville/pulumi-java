// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Group contract Properties.
 * 
 */
public final class GroupContractPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GroupContractPropertiesResponse Empty = new GroupContractPropertiesResponse();

    /**
     * true if the group is one of the three system groups (Administrators, Developers, or Guests); otherwise false.
     * 
     */
    @InputImport(name="builtIn", required=true)
      private final Boolean builtIn;

    public Boolean getBuiltIn() {
        return this.builtIn;
    }

    /**
     * Group description. Can contain HTML formatting tags.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Group name.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * For external groups, this property contains the id of the group from the external identity provider, e.g. for Azure Active Directory `aad://<tenant>.onmicrosoft.com/groups/<group object id>`; otherwise the value is null.
     * 
     */
    @InputImport(name="externalId")
      private final @Nullable String externalId;

    public Optional<String> getExternalId() {
        return this.externalId == null ? Optional.empty() : Optional.ofNullable(this.externalId);
    }

    /**
     * Group type.
     * 
     */
    @InputImport(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public GroupContractPropertiesResponse(
        Boolean builtIn,
        @Nullable String description,
        String displayName,
        @Nullable String externalId,
        @Nullable String type) {
        this.builtIn = Objects.requireNonNull(builtIn, "expected parameter 'builtIn' to be non-null");
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.externalId = externalId;
        this.type = type;
    }

    private GroupContractPropertiesResponse() {
        this.builtIn = null;
        this.description = null;
        this.displayName = null;
        this.externalId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupContractPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean builtIn;
        private @Nullable String description;
        private String displayName;
        private @Nullable String externalId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupContractPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builtIn = defaults.builtIn;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.externalId = defaults.externalId;
    	      this.type = defaults.type;
        }

        public Builder setBuiltIn(Boolean builtIn) {
            this.builtIn = Objects.requireNonNull(builtIn);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setExternalId(@Nullable String externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public GroupContractPropertiesResponse build() {
            return new GroupContractPropertiesResponse(builtIn, description, displayName, externalId, type);
        }
    }
}
