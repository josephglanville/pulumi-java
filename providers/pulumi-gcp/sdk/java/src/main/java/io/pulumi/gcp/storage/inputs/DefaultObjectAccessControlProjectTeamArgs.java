// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultObjectAccessControlProjectTeamArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultObjectAccessControlProjectTeamArgs Empty = new DefaultObjectAccessControlProjectTeamArgs();

    @Import(name="projectNumber")
      private final @Nullable Output<String> projectNumber;

    public Output<String> getProjectNumber() {
        return this.projectNumber == null ? Output.empty() : this.projectNumber;
    }

    @Import(name="team")
      private final @Nullable Output<String> team;

    public Output<String> getTeam() {
        return this.team == null ? Output.empty() : this.team;
    }

    public DefaultObjectAccessControlProjectTeamArgs(
        @Nullable Output<String> projectNumber,
        @Nullable Output<String> team) {
        this.projectNumber = projectNumber;
        this.team = team;
    }

    private DefaultObjectAccessControlProjectTeamArgs() {
        this.projectNumber = Output.empty();
        this.team = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultObjectAccessControlProjectTeamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> projectNumber;
        private @Nullable Output<String> team;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultObjectAccessControlProjectTeamArgs defaults) {
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
        }        public DefaultObjectAccessControlProjectTeamArgs build() {
            return new DefaultObjectAccessControlProjectTeamArgs(projectNumber, team);
        }
    }
}
