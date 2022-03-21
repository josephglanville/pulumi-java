// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntentFollowupIntentInfoGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntentFollowupIntentInfoGetArgs Empty = new IntentFollowupIntentInfoGetArgs();

    @Import(name="followupIntentName")
      private final @Nullable Output<String> followupIntentName;

    public Output<String> getFollowupIntentName() {
        return this.followupIntentName == null ? Output.empty() : this.followupIntentName;
    }

    /**
     * The unique identifier of the parent intent in the chain of followup intents.
     * Format: projects/<Project ID>/agent/intents/<Intent ID>.
     * 
     */
    @Import(name="parentFollowupIntentName")
      private final @Nullable Output<String> parentFollowupIntentName;

    public Output<String> getParentFollowupIntentName() {
        return this.parentFollowupIntentName == null ? Output.empty() : this.parentFollowupIntentName;
    }

    public IntentFollowupIntentInfoGetArgs(
        @Nullable Output<String> followupIntentName,
        @Nullable Output<String> parentFollowupIntentName) {
        this.followupIntentName = followupIntentName;
        this.parentFollowupIntentName = parentFollowupIntentName;
    }

    private IntentFollowupIntentInfoGetArgs() {
        this.followupIntentName = Output.empty();
        this.parentFollowupIntentName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentFollowupIntentInfoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> followupIntentName;
        private @Nullable Output<String> parentFollowupIntentName;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentFollowupIntentInfoGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.followupIntentName = defaults.followupIntentName;
    	      this.parentFollowupIntentName = defaults.parentFollowupIntentName;
        }

        public Builder followupIntentName(@Nullable Output<String> followupIntentName) {
            this.followupIntentName = followupIntentName;
            return this;
        }
        public Builder followupIntentName(@Nullable String followupIntentName) {
            this.followupIntentName = Output.ofNullable(followupIntentName);
            return this;
        }
        public Builder parentFollowupIntentName(@Nullable Output<String> parentFollowupIntentName) {
            this.parentFollowupIntentName = parentFollowupIntentName;
            return this;
        }
        public Builder parentFollowupIntentName(@Nullable String parentFollowupIntentName) {
            this.parentFollowupIntentName = Output.ofNullable(parentFollowupIntentName);
            return this;
        }        public IntentFollowupIntentInfoGetArgs build() {
            return new IntentFollowupIntentInfoGetArgs(followupIntentName, parentFollowupIntentName);
        }
    }
}
