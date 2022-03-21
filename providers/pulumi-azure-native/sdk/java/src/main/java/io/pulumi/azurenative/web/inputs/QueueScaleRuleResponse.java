// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ScaleRuleAuthResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container App container Azure Queue based scaling rule.
 * 
 */
public final class QueueScaleRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final QueueScaleRuleResponse Empty = new QueueScaleRuleResponse();

    /**
     * Authentication secrets for the queue scale rule.
     * 
     */
    @Import(name="auth")
      private final @Nullable List<ScaleRuleAuthResponse> auth;

    public List<ScaleRuleAuthResponse> getAuth() {
        return this.auth == null ? List.of() : this.auth;
    }

    /**
     * Queue length.
     * 
     */
    @Import(name="queueLength")
      private final @Nullable Integer queueLength;

    public Optional<Integer> getQueueLength() {
        return this.queueLength == null ? Optional.empty() : Optional.ofNullable(this.queueLength);
    }

    /**
     * Queue name.
     * 
     */
    @Import(name="queueName")
      private final @Nullable String queueName;

    public Optional<String> getQueueName() {
        return this.queueName == null ? Optional.empty() : Optional.ofNullable(this.queueName);
    }

    public QueueScaleRuleResponse(
        @Nullable List<ScaleRuleAuthResponse> auth,
        @Nullable Integer queueLength,
        @Nullable String queueName) {
        this.auth = auth;
        this.queueLength = queueLength;
        this.queueName = queueName;
    }

    private QueueScaleRuleResponse() {
        this.auth = List.of();
        this.queueLength = null;
        this.queueName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueScaleRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ScaleRuleAuthResponse> auth;
        private @Nullable Integer queueLength;
        private @Nullable String queueName;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueScaleRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.queueLength = defaults.queueLength;
    	      this.queueName = defaults.queueName;
        }

        public Builder auth(@Nullable List<ScaleRuleAuthResponse> auth) {
            this.auth = auth;
            return this;
        }
        public Builder auth(ScaleRuleAuthResponse... auth) {
            return auth(List.of(auth));
        }
        public Builder queueLength(@Nullable Integer queueLength) {
            this.queueLength = queueLength;
            return this;
        }
        public Builder queueName(@Nullable String queueName) {
            this.queueName = queueName;
            return this;
        }        public QueueScaleRuleResponse build() {
            return new QueueScaleRuleResponse(auth, queueLength, queueName);
        }
    }
}
