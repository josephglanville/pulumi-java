// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityNotificationTopicArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityNotificationTopicArgs Empty = new IdentityNotificationTopicArgs();

    /**
     * The identity for which the Amazon SNS topic will be set. You can specify an identity by using its name or by using its Amazon Resource Name (ARN).
     * 
     */
    @Import(name="identity", required=true)
      private final Output<String> identity;

    public Output<String> getIdentity() {
        return this.identity;
    }

    /**
     * Whether SES should include original email headers in SNS notifications of this type. *false* by default.
     * 
     */
    @Import(name="includeOriginalHeaders")
      private final @Nullable Output<Boolean> includeOriginalHeaders;

    public Output<Boolean> getIncludeOriginalHeaders() {
        return this.includeOriginalHeaders == null ? Output.empty() : this.includeOriginalHeaders;
    }

    /**
     * The type of notifications that will be published to the specified Amazon SNS topic. Valid Values: *Bounce*, *Complaint* or *Delivery*.
     * 
     */
    @Import(name="notificationType", required=true)
      private final Output<String> notificationType;

    public Output<String> getNotificationType() {
        return this.notificationType;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic. Can be set to "" (an empty string) to disable publishing.
     * 
     */
    @Import(name="topicArn")
      private final @Nullable Output<String> topicArn;

    public Output<String> getTopicArn() {
        return this.topicArn == null ? Output.empty() : this.topicArn;
    }

    public IdentityNotificationTopicArgs(
        Output<String> identity,
        @Nullable Output<Boolean> includeOriginalHeaders,
        Output<String> notificationType,
        @Nullable Output<String> topicArn) {
        this.identity = Objects.requireNonNull(identity, "expected parameter 'identity' to be non-null");
        this.includeOriginalHeaders = includeOriginalHeaders;
        this.notificationType = Objects.requireNonNull(notificationType, "expected parameter 'notificationType' to be non-null");
        this.topicArn = topicArn;
    }

    private IdentityNotificationTopicArgs() {
        this.identity = Output.empty();
        this.includeOriginalHeaders = Output.empty();
        this.notificationType = Output.empty();
        this.topicArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityNotificationTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> identity;
        private @Nullable Output<Boolean> includeOriginalHeaders;
        private Output<String> notificationType;
        private @Nullable Output<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityNotificationTopicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.includeOriginalHeaders = defaults.includeOriginalHeaders;
    	      this.notificationType = defaults.notificationType;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder identity(Output<String> identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }
        public Builder identity(String identity) {
            this.identity = Output.of(Objects.requireNonNull(identity));
            return this;
        }
        public Builder includeOriginalHeaders(@Nullable Output<Boolean> includeOriginalHeaders) {
            this.includeOriginalHeaders = includeOriginalHeaders;
            return this;
        }
        public Builder includeOriginalHeaders(@Nullable Boolean includeOriginalHeaders) {
            this.includeOriginalHeaders = Output.ofNullable(includeOriginalHeaders);
            return this;
        }
        public Builder notificationType(Output<String> notificationType) {
            this.notificationType = Objects.requireNonNull(notificationType);
            return this;
        }
        public Builder notificationType(String notificationType) {
            this.notificationType = Output.of(Objects.requireNonNull(notificationType));
            return this;
        }
        public Builder topicArn(@Nullable Output<String> topicArn) {
            this.topicArn = topicArn;
            return this;
        }
        public Builder topicArn(@Nullable String topicArn) {
            this.topicArn = Output.ofNullable(topicArn);
            return this;
        }        public IdentityNotificationTopicArgs build() {
            return new IdentityNotificationTopicArgs(identity, includeOriginalHeaders, notificationType, topicArn);
        }
    }
}
