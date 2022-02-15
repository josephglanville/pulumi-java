// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerGithubPushArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerGithubPushArgs Empty = new TriggerGithubPushArgs();

    @InputImport(name="branch")
    private final @Nullable Input<String> branch;

    public Input<String> getBranch() {
        return this.branch == null ? Input.empty() : this.branch;
    }

    @InputImport(name="invertRegex")
    private final @Nullable Input<Boolean> invertRegex;

    public Input<Boolean> getInvertRegex() {
        return this.invertRegex == null ? Input.empty() : this.invertRegex;
    }

    @InputImport(name="tag")
    private final @Nullable Input<String> tag;

    public Input<String> getTag() {
        return this.tag == null ? Input.empty() : this.tag;
    }

    public TriggerGithubPushArgs(
        @Nullable Input<String> branch,
        @Nullable Input<Boolean> invertRegex,
        @Nullable Input<String> tag) {
        this.branch = branch;
        this.invertRegex = invertRegex;
        this.tag = tag;
    }

    private TriggerGithubPushArgs() {
        this.branch = Input.empty();
        this.invertRegex = Input.empty();
        this.tag = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerGithubPushArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> branch;
        private @Nullable Input<Boolean> invertRegex;
        private @Nullable Input<String> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerGithubPushArgs defaults) {
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

        public TriggerGithubPushArgs build() {
            return new TriggerGithubPushArgs(branch, invertRegex, tag);
        }
    }
}