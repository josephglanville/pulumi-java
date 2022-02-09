// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EmailReceiverResponse {
    private final String emailAddress;
    private final String name;
    private final String status;
    private final @Nullable Boolean useCommonAlertSchema;

    @OutputCustomType.Constructor({"emailAddress","name","status","useCommonAlertSchema"})
    private EmailReceiverResponse(
        String emailAddress,
        String name,
        String status,
        @Nullable Boolean useCommonAlertSchema) {
        this.emailAddress = Objects.requireNonNull(emailAddress);
        this.name = Objects.requireNonNull(name);
        this.status = Objects.requireNonNull(status);
        this.useCommonAlertSchema = useCommonAlertSchema;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
    public String getName() {
        return this.name;
    }
    public String getStatus() {
        return this.status;
    }
    public Optional<Boolean> getUseCommonAlertSchema() {
        return Optional.ofNullable(this.useCommonAlertSchema);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String emailAddress;
        private String name;
        private String status;
        private @Nullable Boolean useCommonAlertSchema;

        public Builder() {
    	      // Empty
        }

        public Builder(EmailReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setUseCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }

        public EmailReceiverResponse build() {
            return new EmailReceiverResponse(emailAddress, name, status, useCommonAlertSchema);
        }
    }
}
