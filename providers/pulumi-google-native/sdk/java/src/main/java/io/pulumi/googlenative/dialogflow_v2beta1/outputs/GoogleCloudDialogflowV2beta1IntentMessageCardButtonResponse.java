// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse {
    /**
     * Optional. The text to send back to the Dialogflow API or a URI to open.
     * 
     */
    private final String postback;
    /**
     * Optional. The text to show on the button.
     * 
     */
    private final String text;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse(
        @CustomType.Parameter("postback") String postback,
        @CustomType.Parameter("text") String text) {
        this.postback = postback;
        this.text = text;
    }

    /**
     * Optional. The text to send back to the Dialogflow API or a URI to open.
     * 
    */
    public String getPostback() {
        return this.postback;
    }
    /**
     * Optional. The text to show on the button.
     * 
    */
    public String getText() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String postback;
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.postback = defaults.postback;
    	      this.text = defaults.text;
        }

        public Builder postback(String postback) {
            this.postback = Objects.requireNonNull(postback);
            return this;
        }
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse(postback, text);
        }
    }
}
