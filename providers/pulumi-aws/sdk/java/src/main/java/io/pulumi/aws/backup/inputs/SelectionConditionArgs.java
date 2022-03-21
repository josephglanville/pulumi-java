// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.inputs;

import io.pulumi.aws.backup.inputs.SelectionConditionStringEqualArgs;
import io.pulumi.aws.backup.inputs.SelectionConditionStringLikeArgs;
import io.pulumi.aws.backup.inputs.SelectionConditionStringNotEqualArgs;
import io.pulumi.aws.backup.inputs.SelectionConditionStringNotLikeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SelectionConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SelectionConditionArgs Empty = new SelectionConditionArgs();

    @Import(name="stringEquals")
      private final @Nullable Output<List<SelectionConditionStringEqualArgs>> stringEquals;

    public Output<List<SelectionConditionStringEqualArgs>> getStringEquals() {
        return this.stringEquals == null ? Output.empty() : this.stringEquals;
    }

    @Import(name="stringLikes")
      private final @Nullable Output<List<SelectionConditionStringLikeArgs>> stringLikes;

    public Output<List<SelectionConditionStringLikeArgs>> getStringLikes() {
        return this.stringLikes == null ? Output.empty() : this.stringLikes;
    }

    @Import(name="stringNotEquals")
      private final @Nullable Output<List<SelectionConditionStringNotEqualArgs>> stringNotEquals;

    public Output<List<SelectionConditionStringNotEqualArgs>> getStringNotEquals() {
        return this.stringNotEquals == null ? Output.empty() : this.stringNotEquals;
    }

    @Import(name="stringNotLikes")
      private final @Nullable Output<List<SelectionConditionStringNotLikeArgs>> stringNotLikes;

    public Output<List<SelectionConditionStringNotLikeArgs>> getStringNotLikes() {
        return this.stringNotLikes == null ? Output.empty() : this.stringNotLikes;
    }

    public SelectionConditionArgs(
        @Nullable Output<List<SelectionConditionStringEqualArgs>> stringEquals,
        @Nullable Output<List<SelectionConditionStringLikeArgs>> stringLikes,
        @Nullable Output<List<SelectionConditionStringNotEqualArgs>> stringNotEquals,
        @Nullable Output<List<SelectionConditionStringNotLikeArgs>> stringNotLikes) {
        this.stringEquals = stringEquals;
        this.stringLikes = stringLikes;
        this.stringNotEquals = stringNotEquals;
        this.stringNotLikes = stringNotLikes;
    }

    private SelectionConditionArgs() {
        this.stringEquals = Output.empty();
        this.stringLikes = Output.empty();
        this.stringNotEquals = Output.empty();
        this.stringNotLikes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectionConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SelectionConditionStringEqualArgs>> stringEquals;
        private @Nullable Output<List<SelectionConditionStringLikeArgs>> stringLikes;
        private @Nullable Output<List<SelectionConditionStringNotEqualArgs>> stringNotEquals;
        private @Nullable Output<List<SelectionConditionStringNotLikeArgs>> stringNotLikes;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectionConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stringEquals = defaults.stringEquals;
    	      this.stringLikes = defaults.stringLikes;
    	      this.stringNotEquals = defaults.stringNotEquals;
    	      this.stringNotLikes = defaults.stringNotLikes;
        }

        public Builder stringEquals(@Nullable Output<List<SelectionConditionStringEqualArgs>> stringEquals) {
            this.stringEquals = stringEquals;
            return this;
        }
        public Builder stringEquals(@Nullable List<SelectionConditionStringEqualArgs> stringEquals) {
            this.stringEquals = Output.ofNullable(stringEquals);
            return this;
        }
        public Builder stringEquals(SelectionConditionStringEqualArgs... stringEquals) {
            return stringEquals(List.of(stringEquals));
        }
        public Builder stringLikes(@Nullable Output<List<SelectionConditionStringLikeArgs>> stringLikes) {
            this.stringLikes = stringLikes;
            return this;
        }
        public Builder stringLikes(@Nullable List<SelectionConditionStringLikeArgs> stringLikes) {
            this.stringLikes = Output.ofNullable(stringLikes);
            return this;
        }
        public Builder stringLikes(SelectionConditionStringLikeArgs... stringLikes) {
            return stringLikes(List.of(stringLikes));
        }
        public Builder stringNotEquals(@Nullable Output<List<SelectionConditionStringNotEqualArgs>> stringNotEquals) {
            this.stringNotEquals = stringNotEquals;
            return this;
        }
        public Builder stringNotEquals(@Nullable List<SelectionConditionStringNotEqualArgs> stringNotEquals) {
            this.stringNotEquals = Output.ofNullable(stringNotEquals);
            return this;
        }
        public Builder stringNotEquals(SelectionConditionStringNotEqualArgs... stringNotEquals) {
            return stringNotEquals(List.of(stringNotEquals));
        }
        public Builder stringNotLikes(@Nullable Output<List<SelectionConditionStringNotLikeArgs>> stringNotLikes) {
            this.stringNotLikes = stringNotLikes;
            return this;
        }
        public Builder stringNotLikes(@Nullable List<SelectionConditionStringNotLikeArgs> stringNotLikes) {
            this.stringNotLikes = Output.ofNullable(stringNotLikes);
            return this;
        }
        public Builder stringNotLikes(SelectionConditionStringNotLikeArgs... stringNotLikes) {
            return stringNotLikes(List.of(stringNotLikes));
        }        public SelectionConditionArgs build() {
            return new SelectionConditionArgs(stringEquals, stringLikes, stringNotEquals, stringNotLikes);
        }
    }
}
