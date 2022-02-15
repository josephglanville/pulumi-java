// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudDialogflowCxV3beta1FulfillmentResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1FulfillmentResponse Empty = new GoogleCloudDialogflowCxV3beta1FulfillmentResponse();

    @InputImport(name="conditionalCases", required=true)
    private final List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse> conditionalCases;

    public List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse> getConditionalCases() {
        return this.conditionalCases;
    }

    @InputImport(name="messages", required=true)
    private final List<GoogleCloudDialogflowCxV3beta1ResponseMessageResponse> messages;

    public List<GoogleCloudDialogflowCxV3beta1ResponseMessageResponse> getMessages() {
        return this.messages;
    }

    @InputImport(name="returnPartialResponses", required=true)
    private final Boolean returnPartialResponses;

    public Boolean getReturnPartialResponses() {
        return this.returnPartialResponses;
    }

    @InputImport(name="setParameterActions", required=true)
    private final List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse> setParameterActions;

    public List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse> getSetParameterActions() {
        return this.setParameterActions;
    }

    @InputImport(name="tag", required=true)
    private final String tag;

    public String getTag() {
        return this.tag;
    }

    @InputImport(name="webhook", required=true)
    private final String webhook;

    public String getWebhook() {
        return this.webhook;
    }

    public GoogleCloudDialogflowCxV3beta1FulfillmentResponse(
        List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse> conditionalCases,
        List<GoogleCloudDialogflowCxV3beta1ResponseMessageResponse> messages,
        Boolean returnPartialResponses,
        List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse> setParameterActions,
        String tag,
        String webhook) {
        this.conditionalCases = Objects.requireNonNull(conditionalCases, "expected parameter 'conditionalCases' to be non-null");
        this.messages = Objects.requireNonNull(messages, "expected parameter 'messages' to be non-null");
        this.returnPartialResponses = Objects.requireNonNull(returnPartialResponses, "expected parameter 'returnPartialResponses' to be non-null");
        this.setParameterActions = Objects.requireNonNull(setParameterActions, "expected parameter 'setParameterActions' to be non-null");
        this.tag = Objects.requireNonNull(tag, "expected parameter 'tag' to be non-null");
        this.webhook = Objects.requireNonNull(webhook, "expected parameter 'webhook' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1FulfillmentResponse() {
        this.conditionalCases = List.of();
        this.messages = List.of();
        this.returnPartialResponses = null;
        this.setParameterActions = List.of();
        this.tag = null;
        this.webhook = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FulfillmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse> conditionalCases;
        private List<GoogleCloudDialogflowCxV3beta1ResponseMessageResponse> messages;
        private Boolean returnPartialResponses;
        private List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse> setParameterActions;
        private String tag;
        private String webhook;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FulfillmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionalCases = defaults.conditionalCases;
    	      this.messages = defaults.messages;
    	      this.returnPartialResponses = defaults.returnPartialResponses;
    	      this.setParameterActions = defaults.setParameterActions;
    	      this.tag = defaults.tag;
    	      this.webhook = defaults.webhook;
        }

        public Builder setConditionalCases(List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse> conditionalCases) {
            this.conditionalCases = Objects.requireNonNull(conditionalCases);
            return this;
        }

        public Builder setMessages(List<GoogleCloudDialogflowCxV3beta1ResponseMessageResponse> messages) {
            this.messages = Objects.requireNonNull(messages);
            return this;
        }

        public Builder setReturnPartialResponses(Boolean returnPartialResponses) {
            this.returnPartialResponses = Objects.requireNonNull(returnPartialResponses);
            return this;
        }

        public Builder setSetParameterActions(List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse> setParameterActions) {
            this.setParameterActions = Objects.requireNonNull(setParameterActions);
            return this;
        }

        public Builder setTag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }

        public Builder setWebhook(String webhook) {
            this.webhook = Objects.requireNonNull(webhook);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1FulfillmentResponse build() {
            return new GoogleCloudDialogflowCxV3beta1FulfillmentResponse(conditionalCases, messages, returnPartialResponses, setParameterActions, tag, webhook);
        }
    }
}