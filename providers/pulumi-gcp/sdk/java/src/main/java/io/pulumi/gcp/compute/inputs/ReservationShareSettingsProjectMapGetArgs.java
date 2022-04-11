// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationShareSettingsProjectMapGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationShareSettingsProjectMapGetArgs Empty = new ReservationShareSettingsProjectMapGetArgs();

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    /**
     * The project id/number, should be same as the key of this project config in the project map.
     * 
     */
    @Import(name="projectId")
      private final @Nullable Output<String> projectId;

    public Output<String> getProjectId() {
        return this.projectId == null ? Codegen.empty() : this.projectId;
    }

    public ReservationShareSettingsProjectMapGetArgs(
        Output<String> id,
        @Nullable Output<String> projectId) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.projectId = projectId;
    }

    private ReservationShareSettingsProjectMapGetArgs() {
        this.id = Codegen.empty();
        this.projectId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationShareSettingsProjectMapGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> id;
        private @Nullable Output<String> projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationShareSettingsProjectMapGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.projectId = defaults.projectId;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder projectId(@Nullable Output<String> projectId) {
            this.projectId = projectId;
            return this;
        }
        public Builder projectId(@Nullable String projectId) {
            this.projectId = Codegen.ofNullable(projectId);
            return this;
        }        public ReservationShareSettingsProjectMapGetArgs build() {
            return new ReservationShareSettingsProjectMapGetArgs(id, projectId);
        }
    }
}
