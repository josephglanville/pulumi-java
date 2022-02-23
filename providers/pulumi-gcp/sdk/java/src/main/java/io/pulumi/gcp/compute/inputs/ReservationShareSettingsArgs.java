// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.ReservationShareSettingsProjectMapArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationShareSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationShareSettingsArgs Empty = new ReservationShareSettingsArgs();

    /**
     * A map of project number and project config. This is only valid when shareType's value is SPECIFIC_PROJECTS.
     * Structure is documented below.
     * 
     */
    @InputImport(name="projectMaps")
      private final @Nullable Input<List<ReservationShareSettingsProjectMapArgs>> projectMaps;

    public Input<List<ReservationShareSettingsProjectMapArgs>> getProjectMaps() {
        return this.projectMaps == null ? Input.empty() : this.projectMaps;
    }

    /**
     * Type of sharing for this shared-reservation
     * Possible values are `LOCAL` and `SPECIFIC_PROJECTS`.
     * 
     */
    @InputImport(name="shareType")
      private final @Nullable Input<String> shareType;

    public Input<String> getShareType() {
        return this.shareType == null ? Input.empty() : this.shareType;
    }

    public ReservationShareSettingsArgs(
        @Nullable Input<List<ReservationShareSettingsProjectMapArgs>> projectMaps,
        @Nullable Input<String> shareType) {
        this.projectMaps = projectMaps;
        this.shareType = shareType;
    }

    private ReservationShareSettingsArgs() {
        this.projectMaps = Input.empty();
        this.shareType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationShareSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ReservationShareSettingsProjectMapArgs>> projectMaps;
        private @Nullable Input<String> shareType;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationShareSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectMaps = defaults.projectMaps;
    	      this.shareType = defaults.shareType;
        }

        public Builder setProjectMaps(@Nullable Input<List<ReservationShareSettingsProjectMapArgs>> projectMaps) {
            this.projectMaps = projectMaps;
            return this;
        }

        public Builder setProjectMaps(@Nullable List<ReservationShareSettingsProjectMapArgs> projectMaps) {
            this.projectMaps = Input.ofNullable(projectMaps);
            return this;
        }

        public Builder setShareType(@Nullable Input<String> shareType) {
            this.shareType = shareType;
            return this;
        }

        public Builder setShareType(@Nullable String shareType) {
            this.shareType = Input.ofNullable(shareType);
            return this;
        }
        public ReservationShareSettingsArgs build() {
            return new ReservationShareSettingsArgs(projectMaps, shareType);
        }
    }
}
