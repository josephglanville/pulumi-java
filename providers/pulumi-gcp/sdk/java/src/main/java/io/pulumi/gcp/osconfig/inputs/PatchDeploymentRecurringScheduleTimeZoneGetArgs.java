// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentRecurringScheduleTimeZoneGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentRecurringScheduleTimeZoneGetArgs Empty = new PatchDeploymentRecurringScheduleTimeZoneGetArgs();

    /**
     * IANA Time Zone Database time zone, e.g. "America/New_York".
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * IANA Time Zone Database version number, e.g. "2019a".
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public PatchDeploymentRecurringScheduleTimeZoneGetArgs(
        Input<String> id,
        @Nullable Input<String> version) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.version = version;
    }

    private PatchDeploymentRecurringScheduleTimeZoneGetArgs() {
        this.id = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRecurringScheduleTimeZoneGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> id;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentRecurringScheduleTimeZoneGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.version = defaults.version;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public PatchDeploymentRecurringScheduleTimeZoneGetArgs build() {
            return new PatchDeploymentRecurringScheduleTimeZoneGetArgs(id, version);
        }
    }
}
