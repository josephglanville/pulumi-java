// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The quick replies response message.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageQuickRepliesArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageQuickRepliesArgs Empty = new GoogleCloudDialogflowV2IntentMessageQuickRepliesArgs();

    /**
     * Optional. The collection of quick replies.
     * 
     */
    @Import(name="quickReplies")
      private final @Nullable Output<List<String>> quickReplies;

    public Output<List<String>> getQuickReplies() {
        return this.quickReplies == null ? Codegen.empty() : this.quickReplies;
    }

    /**
     * Optional. The title of the collection of quick replies.
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> getTitle() {
        return this.title == null ? Codegen.empty() : this.title;
    }

    public GoogleCloudDialogflowV2IntentMessageQuickRepliesArgs(
        @Nullable Output<List<String>> quickReplies,
        @Nullable Output<String> title) {
        this.quickReplies = quickReplies;
        this.title = title;
    }

    private GoogleCloudDialogflowV2IntentMessageQuickRepliesArgs() {
        this.quickReplies = Codegen.empty();
        this.title = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageQuickRepliesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> quickReplies;
        private @Nullable Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageQuickRepliesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quickReplies = defaults.quickReplies;
    	      this.title = defaults.title;
        }

        public Builder quickReplies(@Nullable Output<List<String>> quickReplies) {
            this.quickReplies = quickReplies;
            return this;
        }
        public Builder quickReplies(@Nullable List<String> quickReplies) {
            this.quickReplies = Codegen.ofNullable(quickReplies);
            return this;
        }
        public Builder quickReplies(String... quickReplies) {
            return quickReplies(List.of(quickReplies));
        }
        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = Codegen.ofNullable(title);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageQuickRepliesArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageQuickRepliesArgs(quickReplies, title);
        }
    }
}
