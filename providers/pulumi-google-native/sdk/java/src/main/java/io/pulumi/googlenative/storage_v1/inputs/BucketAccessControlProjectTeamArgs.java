// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The project team associated with the entity, if any.
 * 
 */
public final class BucketAccessControlProjectTeamArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketAccessControlProjectTeamArgs Empty = new BucketAccessControlProjectTeamArgs();

    /**
     * The project number.
     * 
     */
    @InputImport(name="projectNumber")
      private final @Nullable Output<String> projectNumber;

    public Output<String> getProjectNumber() {
        return this.projectNumber == null ? Output.empty() : this.projectNumber;
    }

    /**
     * The team.
     * 
     */
    @InputImport(name="team")
      private final @Nullable Output<String> team;

    public Output<String> getTeam() {
        return this.team == null ? Output.empty() : this.team;
    }

    public BucketAccessControlProjectTeamArgs(
        @Nullable Output<String> projectNumber,
        @Nullable Output<String> team) {
        this.projectNumber = projectNumber;
        this.team = team;
    }

    private BucketAccessControlProjectTeamArgs() {
        this.projectNumber = Output.empty();
        this.team = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAccessControlProjectTeamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> projectNumber;
        private @Nullable Output<String> team;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAccessControlProjectTeamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectNumber = defaults.projectNumber;
    	      this.team = defaults.team;
        }

        public Builder projectNumber(@Nullable Output<String> projectNumber) {
            this.projectNumber = projectNumber;
            return this;
        }

        public Builder projectNumber(@Nullable String projectNumber) {
            this.projectNumber = Output.ofNullable(projectNumber);
            return this;
        }

        public Builder team(@Nullable Output<String> team) {
            this.team = team;
            return this;
        }

        public Builder team(@Nullable String team) {
            this.team = Output.ofNullable(team);
            return this;
        }
        public BucketAccessControlProjectTeamArgs build() {
            return new BucketAccessControlProjectTeamArgs(projectNumber, team);
        }
    }
}
