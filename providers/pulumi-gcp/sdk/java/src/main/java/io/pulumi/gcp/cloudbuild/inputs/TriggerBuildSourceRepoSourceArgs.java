// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerBuildSourceRepoSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerBuildSourceRepoSourceArgs Empty = new TriggerBuildSourceRepoSourceArgs();

    /**
     * Regex matching branches to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    @InputImport(name="branchName")
      private final @Nullable Input<String> branchName;

    public Input<String> getBranchName() {
        return this.branchName == null ? Input.empty() : this.branchName;
    }

    /**
     * Explicit commit SHA to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * 
     */
    @InputImport(name="commitSha")
      private final @Nullable Input<String> commitSha;

    public Input<String> getCommitSha() {
        return this.commitSha == null ? Input.empty() : this.commitSha;
    }

    /**
     * Working directory to use when running this step's container.
     * If this value is a relative path, it is relative to the build's working
     * directory. If this value is absolute, it may be outside the build's working
     * directory, in which case the contents of the path may not be persisted
     * across build step executions, unless a `volume` for that path is specified.
     * If the build specifies a `RepoSource` with `dir` and a step with a
     * `dir`,
     * which specifies an absolute path, the `RepoSource` `dir` is ignored
     * for the step's execution.
     * 
     */
    @InputImport(name="dir")
      private final @Nullable Input<String> dir;

    public Input<String> getDir() {
        return this.dir == null ? Input.empty() : this.dir;
    }

    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    @InputImport(name="invertRegex")
      private final @Nullable Input<Boolean> invertRegex;

    public Input<Boolean> getInvertRegex() {
        return this.invertRegex == null ? Input.empty() : this.invertRegex;
    }

    /**
     * ID of the project that owns the Cloud Source Repository.
     * If omitted, the project ID requesting the build is assumed.
     * 
     */
    @InputImport(name="projectId")
      private final @Nullable Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId == null ? Input.empty() : this.projectId;
    }

    /**
     * Name of the Cloud Source Repository.
     * 
     */
    @InputImport(name="repoName", required=true)
      private final Input<String> repoName;

    public Input<String> getRepoName() {
        return this.repoName;
    }

    /**
     * Substitutions to use in a triggered build. Should only be used with triggers.run
     * 
     */
    @InputImport(name="substitutions")
      private final @Nullable Input<Map<String,String>> substitutions;

    public Input<Map<String,String>> getSubstitutions() {
        return this.substitutions == null ? Input.empty() : this.substitutions;
    }

    /**
     * Regex matching tags to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    @InputImport(name="tagName")
      private final @Nullable Input<String> tagName;

    public Input<String> getTagName() {
        return this.tagName == null ? Input.empty() : this.tagName;
    }

    public TriggerBuildSourceRepoSourceArgs(
        @Nullable Input<String> branchName,
        @Nullable Input<String> commitSha,
        @Nullable Input<String> dir,
        @Nullable Input<Boolean> invertRegex,
        @Nullable Input<String> projectId,
        Input<String> repoName,
        @Nullable Input<Map<String,String>> substitutions,
        @Nullable Input<String> tagName) {
        this.branchName = branchName;
        this.commitSha = commitSha;
        this.dir = dir;
        this.invertRegex = invertRegex;
        this.projectId = projectId;
        this.repoName = Objects.requireNonNull(repoName, "expected parameter 'repoName' to be non-null");
        this.substitutions = substitutions;
        this.tagName = tagName;
    }

    private TriggerBuildSourceRepoSourceArgs() {
        this.branchName = Input.empty();
        this.commitSha = Input.empty();
        this.dir = Input.empty();
        this.invertRegex = Input.empty();
        this.projectId = Input.empty();
        this.repoName = Input.empty();
        this.substitutions = Input.empty();
        this.tagName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildSourceRepoSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> branchName;
        private @Nullable Input<String> commitSha;
        private @Nullable Input<String> dir;
        private @Nullable Input<Boolean> invertRegex;
        private @Nullable Input<String> projectId;
        private Input<String> repoName;
        private @Nullable Input<Map<String,String>> substitutions;
        private @Nullable Input<String> tagName;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildSourceRepoSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.commitSha = defaults.commitSha;
    	      this.dir = defaults.dir;
    	      this.invertRegex = defaults.invertRegex;
    	      this.projectId = defaults.projectId;
    	      this.repoName = defaults.repoName;
    	      this.substitutions = defaults.substitutions;
    	      this.tagName = defaults.tagName;
        }

        public Builder setBranchName(@Nullable Input<String> branchName) {
            this.branchName = branchName;
            return this;
        }

        public Builder setBranchName(@Nullable String branchName) {
            this.branchName = Input.ofNullable(branchName);
            return this;
        }

        public Builder setCommitSha(@Nullable Input<String> commitSha) {
            this.commitSha = commitSha;
            return this;
        }

        public Builder setCommitSha(@Nullable String commitSha) {
            this.commitSha = Input.ofNullable(commitSha);
            return this;
        }

        public Builder setDir(@Nullable Input<String> dir) {
            this.dir = dir;
            return this;
        }

        public Builder setDir(@Nullable String dir) {
            this.dir = Input.ofNullable(dir);
            return this;
        }

        public Builder setInvertRegex(@Nullable Input<Boolean> invertRegex) {
            this.invertRegex = invertRegex;
            return this;
        }

        public Builder setInvertRegex(@Nullable Boolean invertRegex) {
            this.invertRegex = Input.ofNullable(invertRegex);
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

        public Builder setRepoName(Input<String> repoName) {
            this.repoName = Objects.requireNonNull(repoName);
            return this;
        }

        public Builder setRepoName(String repoName) {
            this.repoName = Input.of(Objects.requireNonNull(repoName));
            return this;
        }

        public Builder setSubstitutions(@Nullable Input<Map<String,String>> substitutions) {
            this.substitutions = substitutions;
            return this;
        }

        public Builder setSubstitutions(@Nullable Map<String,String> substitutions) {
            this.substitutions = Input.ofNullable(substitutions);
            return this;
        }

        public Builder setTagName(@Nullable Input<String> tagName) {
            this.tagName = tagName;
            return this;
        }

        public Builder setTagName(@Nullable String tagName) {
            this.tagName = Input.ofNullable(tagName);
            return this;
        }
        public TriggerBuildSourceRepoSourceArgs build() {
            return new TriggerBuildSourceRepoSourceArgs(branchName, commitSha, dir, invertRegex, projectId, repoName, substitutions, tagName);
        }
    }
}
