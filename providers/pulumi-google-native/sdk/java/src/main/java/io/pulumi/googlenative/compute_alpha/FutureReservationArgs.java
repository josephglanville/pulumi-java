// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.inputs.FutureReservationSpecificSKUPropertiesArgs;
import io.pulumi.googlenative.compute_alpha.inputs.FutureReservationTimeWindowArgs;
import io.pulumi.googlenative.compute_alpha.inputs.ShareSettingsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FutureReservationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FutureReservationArgs Empty = new FutureReservationArgs();

    /**
     * An optional description of this resource. Provide this property when you create the future reservation.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Name prefix for the reservations to be created at the time of delivery. The name prefix must comply with RFC1035. Maximum allowed length for name prefix is 20. Automatically created reservations name format will be -date-####.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * List of Projects/Folders to share with.
     * 
     */
    @Import(name="shareSettings")
      private final @Nullable Output<ShareSettingsArgs> shareSettings;

    public Output<ShareSettingsArgs> getShareSettings() {
        return this.shareSettings == null ? Codegen.empty() : this.shareSettings;
    }

    /**
     * Future Reservation configuration to indicate instance properties and total count.
     * 
     */
    @Import(name="specificSkuProperties")
      private final @Nullable Output<FutureReservationSpecificSKUPropertiesArgs> specificSkuProperties;

    public Output<FutureReservationSpecificSKUPropertiesArgs> getSpecificSkuProperties() {
        return this.specificSkuProperties == null ? Codegen.empty() : this.specificSkuProperties;
    }

    /**
     * Time window for this Future Reservation.
     * 
     */
    @Import(name="timeWindow")
      private final @Nullable Output<FutureReservationTimeWindowArgs> timeWindow;

    public Output<FutureReservationTimeWindowArgs> getTimeWindow() {
        return this.timeWindow == null ? Codegen.empty() : this.timeWindow;
    }

    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Codegen.empty() : this.zone;
    }

    public FutureReservationArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> kind,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<ShareSettingsArgs> shareSettings,
        @Nullable Output<FutureReservationSpecificSKUPropertiesArgs> specificSkuProperties,
        @Nullable Output<FutureReservationTimeWindowArgs> timeWindow,
        @Nullable Output<String> zone) {
        this.description = description;
        this.kind = kind;
        this.name = name;
        this.namePrefix = namePrefix;
        this.project = project;
        this.requestId = requestId;
        this.shareSettings = shareSettings;
        this.specificSkuProperties = specificSkuProperties;
        this.timeWindow = timeWindow;
        this.zone = zone;
    }

    private FutureReservationArgs() {
        this.description = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.shareSettings = Codegen.empty();
        this.specificSkuProperties = Codegen.empty();
        this.timeWindow = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FutureReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<ShareSettingsArgs> shareSettings;
        private @Nullable Output<FutureReservationSpecificSKUPropertiesArgs> specificSkuProperties;
        private @Nullable Output<FutureReservationTimeWindowArgs> timeWindow;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(FutureReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.shareSettings = defaults.shareSettings;
    	      this.specificSkuProperties = defaults.specificSkuProperties;
    	      this.timeWindow = defaults.timeWindow;
    	      this.zone = defaults.zone;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder shareSettings(@Nullable Output<ShareSettingsArgs> shareSettings) {
            this.shareSettings = shareSettings;
            return this;
        }
        public Builder shareSettings(@Nullable ShareSettingsArgs shareSettings) {
            this.shareSettings = Codegen.ofNullable(shareSettings);
            return this;
        }
        public Builder specificSkuProperties(@Nullable Output<FutureReservationSpecificSKUPropertiesArgs> specificSkuProperties) {
            this.specificSkuProperties = specificSkuProperties;
            return this;
        }
        public Builder specificSkuProperties(@Nullable FutureReservationSpecificSKUPropertiesArgs specificSkuProperties) {
            this.specificSkuProperties = Codegen.ofNullable(specificSkuProperties);
            return this;
        }
        public Builder timeWindow(@Nullable Output<FutureReservationTimeWindowArgs> timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }
        public Builder timeWindow(@Nullable FutureReservationTimeWindowArgs timeWindow) {
            this.timeWindow = Codegen.ofNullable(timeWindow);
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Codegen.ofNullable(zone);
            return this;
        }        public FutureReservationArgs build() {
            return new FutureReservationArgs(description, kind, name, namePrefix, project, requestId, shareSettings, specificSkuProperties, timeWindow, zone);
        }
    }
}
