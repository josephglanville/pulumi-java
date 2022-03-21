// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetGuestDiagnosticsSettingsAssociationResult {
    /**
     * The guest diagnostic settings name.
     * 
     */
    private final String guestDiagnosticSettingsName;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetGuestDiagnosticsSettingsAssociationResult(
        @CustomType.Parameter("guestDiagnosticSettingsName") String guestDiagnosticSettingsName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.guestDiagnosticSettingsName = guestDiagnosticSettingsName;
        this.id = id;
        this.location = location;
        this.name = name;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The guest diagnostic settings name.
     * 
    */
    public String getGuestDiagnosticSettingsName() {
        return this.guestDiagnosticSettingsName;
    }
    /**
     * Azure resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Azure resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Azure resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGuestDiagnosticsSettingsAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String guestDiagnosticSettingsName;
        private String id;
        private String location;
        private String name;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGuestDiagnosticsSettingsAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestDiagnosticSettingsName = defaults.guestDiagnosticSettingsName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder guestDiagnosticSettingsName(String guestDiagnosticSettingsName) {
            this.guestDiagnosticSettingsName = Objects.requireNonNull(guestDiagnosticSettingsName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetGuestDiagnosticsSettingsAssociationResult build() {
            return new GetGuestDiagnosticsSettingsAssociationResult(guestDiagnosticSettingsName, id, location, name, tags, type);
        }
    }
}
