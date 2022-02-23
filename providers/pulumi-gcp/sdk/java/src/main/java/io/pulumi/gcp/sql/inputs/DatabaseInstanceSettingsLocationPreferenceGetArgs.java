// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceSettingsLocationPreferenceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceSettingsLocationPreferenceGetArgs Empty = new DatabaseInstanceSettingsLocationPreferenceGetArgs();

    /**
     * A GAE application whose zone to remain
     * in. Must be in the same region as this instance.
     * 
     */
    @InputImport(name="followGaeApplication")
      private final @Nullable Input<String> followGaeApplication;

    public Input<String> getFollowGaeApplication() {
        return this.followGaeApplication == null ? Input.empty() : this.followGaeApplication;
    }

    /**
     * The preferred compute engine
     * [zone](https://cloud.google.com/compute/docs/zones?hl=en).
     * 
     */
    @InputImport(name="zone")
      private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public DatabaseInstanceSettingsLocationPreferenceGetArgs(
        @Nullable Input<String> followGaeApplication,
        @Nullable Input<String> zone) {
        this.followGaeApplication = followGaeApplication;
        this.zone = zone;
    }

    private DatabaseInstanceSettingsLocationPreferenceGetArgs() {
        this.followGaeApplication = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsLocationPreferenceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> followGaeApplication;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettingsLocationPreferenceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.followGaeApplication = defaults.followGaeApplication;
    	      this.zone = defaults.zone;
        }

        public Builder setFollowGaeApplication(@Nullable Input<String> followGaeApplication) {
            this.followGaeApplication = followGaeApplication;
            return this;
        }

        public Builder setFollowGaeApplication(@Nullable String followGaeApplication) {
            this.followGaeApplication = Input.ofNullable(followGaeApplication);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public DatabaseInstanceSettingsLocationPreferenceGetArgs build() {
            return new DatabaseInstanceSettingsLocationPreferenceGetArgs(followGaeApplication, zone);
        }
    }
}
