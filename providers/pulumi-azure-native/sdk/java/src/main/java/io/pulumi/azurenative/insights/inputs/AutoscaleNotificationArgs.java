// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.enums.OperationType;
import io.pulumi.azurenative.insights.inputs.EmailNotificationArgs;
import io.pulumi.azurenative.insights.inputs.WebhookNotificationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Autoscale notification.
 * 
 */
public final class AutoscaleNotificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscaleNotificationArgs Empty = new AutoscaleNotificationArgs();

    /**
     * the email notification.
     * 
     */
    @Import(name="email")
      private final @Nullable Output<EmailNotificationArgs> email;

    public Output<EmailNotificationArgs> getEmail() {
        return this.email == null ? Output.empty() : this.email;
    }

    /**
     * the operation associated with the notification and its value must be "scale"
     * 
     */
    @Import(name="operation", required=true)
      private final Output<OperationType> operation;

    public Output<OperationType> getOperation() {
        return this.operation;
    }

    /**
     * the collection of webhook notifications.
     * 
     */
    @Import(name="webhooks")
      private final @Nullable Output<List<WebhookNotificationArgs>> webhooks;

    public Output<List<WebhookNotificationArgs>> getWebhooks() {
        return this.webhooks == null ? Output.empty() : this.webhooks;
    }

    public AutoscaleNotificationArgs(
        @Nullable Output<EmailNotificationArgs> email,
        Output<OperationType> operation,
        @Nullable Output<List<WebhookNotificationArgs>> webhooks) {
        this.email = email;
        this.operation = Objects.requireNonNull(operation, "expected parameter 'operation' to be non-null");
        this.webhooks = webhooks;
    }

    private AutoscaleNotificationArgs() {
        this.email = Output.empty();
        this.operation = Output.empty();
        this.webhooks = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EmailNotificationArgs> email;
        private Output<OperationType> operation;
        private @Nullable Output<List<WebhookNotificationArgs>> webhooks;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleNotificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.operation = defaults.operation;
    	      this.webhooks = defaults.webhooks;
        }

        public Builder email(@Nullable Output<EmailNotificationArgs> email) {
            this.email = email;
            return this;
        }
        public Builder email(@Nullable EmailNotificationArgs email) {
            this.email = Output.ofNullable(email);
            return this;
        }
        public Builder operation(Output<OperationType> operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }
        public Builder operation(OperationType operation) {
            this.operation = Output.of(Objects.requireNonNull(operation));
            return this;
        }
        public Builder webhooks(@Nullable Output<List<WebhookNotificationArgs>> webhooks) {
            this.webhooks = webhooks;
            return this;
        }
        public Builder webhooks(@Nullable List<WebhookNotificationArgs> webhooks) {
            this.webhooks = Output.ofNullable(webhooks);
            return this;
        }
        public Builder webhooks(WebhookNotificationArgs... webhooks) {
            return webhooks(List.of(webhooks));
        }        public AutoscaleNotificationArgs build() {
            return new AutoscaleNotificationArgs(email, operation, webhooks);
        }
    }
}
