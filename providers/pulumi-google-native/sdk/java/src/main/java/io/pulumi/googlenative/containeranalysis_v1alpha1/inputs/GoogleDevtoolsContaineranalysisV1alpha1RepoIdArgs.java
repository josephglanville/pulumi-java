// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A unique identifier for a Cloud Repo.
 * 
 */
public final class GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs Empty = new GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs();

    /**
     * A combination of a project ID and a repo name.
     * 
     */
    @Import(name="projectRepoId")
      private final @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs> projectRepoId;

    public Output<GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs> getProjectRepoId() {
        return this.projectRepoId == null ? Output.empty() : this.projectRepoId;
    }

    /**
     * A server-assigned, globally unique identifier.
     * 
     */
    @Import(name="uid")
      private final @Nullable Output<String> uid;

    public Output<String> getUid() {
        return this.uid == null ? Output.empty() : this.uid;
    }

    public GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs(
        @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs> projectRepoId,
        @Nullable Output<String> uid) {
        this.projectRepoId = projectRepoId;
        this.uid = uid;
    }

    private GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs() {
        this.projectRepoId = Output.empty();
        this.uid = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs> projectRepoId;
        private @Nullable Output<String> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectRepoId = defaults.projectRepoId;
    	      this.uid = defaults.uid;
        }

        public Builder projectRepoId(@Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs> projectRepoId) {
            this.projectRepoId = projectRepoId;
            return this;
        }
        public Builder projectRepoId(@Nullable GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs projectRepoId) {
            this.projectRepoId = Output.ofNullable(projectRepoId);
            return this;
        }
        public Builder uid(@Nullable Output<String> uid) {
            this.uid = uid;
            return this;
        }
        public Builder uid(@Nullable String uid) {
            this.uid = Output.ofNullable(uid);
            return this;
        }        public GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1RepoIdArgs(projectRepoId, uid);
        }
    }
}
