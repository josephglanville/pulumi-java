// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerGithubPushGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerGithubPushGetArgs Empty = new TriggerGithubPushGetArgs();

    /**
     * Regex of branches to match.  Specify only one of branch or tag.
     * 
     */
    @InputImport(name="branch")
      private final @Nullable Input<String> branch;

    public Input<String> getBranch() {
        return this.branch == null ? Input.empty() : this.branch;
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
     * Regex of tags to match.  Specify only one of branch or tag.
     * 
     */
    @InputImport(name="tag")
      private final @Nullable Input<String> tag;

    public Input<String> getTag() {
        return this.tag == null ? Input.empty() : this.tag;
    }

    public TriggerGithubPushGetArgs(
        @Nullable Input<String> branch,
        @Nullable Input<Boolean> invertRegex,
        @Nullable Input<String> tag) {
        this.branch = branch;
        this.invertRegex = invertRegex;
        this.tag = tag;
    }

    private TriggerGithubPushGetArgs() {
        this.branch = Input.empty();
        this.invertRegex = Input.empty();
        this.tag = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerGithubPushGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> branch;
        private @Nullable Input<Boolean> invertRegex;
        private @Nullable Input<String> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerGithubPushGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.invertRegex = defaults.invertRegex;
    	      this.tag = defaults.tag;
        }

        public Builder setBranch(@Nullable Input<String> branch) {
            this.branch = branch;
            return this;
        }

        public Builder setBranch(@Nullable String branch) {
            this.branch = Input.ofNullable(branch);
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

        public Builder setTag(@Nullable Input<String> tag) {
            this.tag = tag;
            return this;
        }

        public Builder setTag(@Nullable String tag) {
            this.tag = Input.ofNullable(tag);
            return this;
        }
        public TriggerGithubPushGetArgs build() {
            return new TriggerGithubPushGetArgs(branch, invertRegex, tag);
        }
    }
}
