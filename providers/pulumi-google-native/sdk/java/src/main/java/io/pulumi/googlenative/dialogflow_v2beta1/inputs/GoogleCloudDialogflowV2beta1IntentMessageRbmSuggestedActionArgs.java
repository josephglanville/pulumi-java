// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDialArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUriArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionShareLocationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rich Business Messaging (RBM) suggested client-side action that the user can choose from the card.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionArgs();

    /**
     * Suggested client side action: Dial a phone number
     * 
     */
    @InputImport(name="dial")
      private final @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDialArgs> dial;

    public Output<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDialArgs> getDial() {
        return this.dial == null ? Output.empty() : this.dial;
    }

    /**
     * Suggested client side action: Open a URI on device
     * 
     */
    @InputImport(name="openUrl")
      private final @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUriArgs> openUrl;

    public Output<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUriArgs> getOpenUrl() {
        return this.openUrl == null ? Output.empty() : this.openUrl;
    }

    /**
     * Opaque payload that the Dialogflow receives in a user event when the user taps the suggested action. This data will be also forwarded to webhook to allow performing custom business logic.
     * 
     */
    @InputImport(name="postbackData")
      private final @Nullable Output<String> postbackData;

    public Output<String> getPostbackData() {
        return this.postbackData == null ? Output.empty() : this.postbackData;
    }

    /**
     * Suggested client side action: Share user location
     * 
     */
    @InputImport(name="shareLocation")
      private final @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionShareLocationArgs> shareLocation;

    public Output<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionShareLocationArgs> getShareLocation() {
        return this.shareLocation == null ? Output.empty() : this.shareLocation;
    }

    /**
     * Text to display alongside the action.
     * 
     */
    @InputImport(name="text")
      private final @Nullable Output<String> text;

    public Output<String> getText() {
        return this.text == null ? Output.empty() : this.text;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionArgs(
        @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDialArgs> dial,
        @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUriArgs> openUrl,
        @Nullable Output<String> postbackData,
        @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionShareLocationArgs> shareLocation,
        @Nullable Output<String> text) {
        this.dial = dial;
        this.openUrl = openUrl;
        this.postbackData = postbackData;
        this.shareLocation = shareLocation;
        this.text = text;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionArgs() {
        this.dial = Output.empty();
        this.openUrl = Output.empty();
        this.postbackData = Output.empty();
        this.shareLocation = Output.empty();
        this.text = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDialArgs> dial;
        private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUriArgs> openUrl;
        private @Nullable Output<String> postbackData;
        private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionShareLocationArgs> shareLocation;
        private @Nullable Output<String> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dial = defaults.dial;
    	      this.openUrl = defaults.openUrl;
    	      this.postbackData = defaults.postbackData;
    	      this.shareLocation = defaults.shareLocation;
    	      this.text = defaults.text;
        }

        public Builder dial(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDialArgs> dial) {
            this.dial = dial;
            return this;
        }

        public Builder dial(@Nullable GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDialArgs dial) {
            this.dial = Output.ofNullable(dial);
            return this;
        }

        public Builder openUrl(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUriArgs> openUrl) {
            this.openUrl = openUrl;
            return this;
        }

        public Builder openUrl(@Nullable GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUriArgs openUrl) {
            this.openUrl = Output.ofNullable(openUrl);
            return this;
        }

        public Builder postbackData(@Nullable Output<String> postbackData) {
            this.postbackData = postbackData;
            return this;
        }

        public Builder postbackData(@Nullable String postbackData) {
            this.postbackData = Output.ofNullable(postbackData);
            return this;
        }

        public Builder shareLocation(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionShareLocationArgs> shareLocation) {
            this.shareLocation = shareLocation;
            return this;
        }

        public Builder shareLocation(@Nullable GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionShareLocationArgs shareLocation) {
            this.shareLocation = Output.ofNullable(shareLocation);
            return this;
        }

        public Builder text(@Nullable Output<String> text) {
            this.text = text;
            return this;
        }

        public Builder text(@Nullable String text) {
            this.text = Output.ofNullable(text);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionArgs(dial, openUrl, postbackData, shareLocation, text);
        }
    }
}
