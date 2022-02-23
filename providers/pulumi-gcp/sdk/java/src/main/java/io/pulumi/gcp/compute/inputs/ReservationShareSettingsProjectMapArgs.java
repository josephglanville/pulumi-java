// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationShareSettingsProjectMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationShareSettingsProjectMapArgs Empty = new ReservationShareSettingsProjectMapArgs();

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * The project id/number, should be same as the key of this project config in the project map.
     * 
     */
    @InputImport(name="projectId")
      private final @Nullable Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId == null ? Input.empty() : this.projectId;
    }

    public ReservationShareSettingsProjectMapArgs(
        Input<String> id,
        @Nullable Input<String> projectId) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.projectId = projectId;
    }

    private ReservationShareSettingsProjectMapArgs() {
        this.id = Input.empty();
        this.projectId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationShareSettingsProjectMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> id;
        private @Nullable Input<String> projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationShareSettingsProjectMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.projectId = defaults.projectId;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setProjectId(@Nullable Input<String> projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setProjectId(@Nullable String projectId) {
            this.projectId = Input.ofNullable(projectId);
            return this;
        }
        public ReservationShareSettingsProjectMapArgs build() {
            return new ReservationShareSettingsProjectMapArgs(id, projectId);
        }
    }
}
