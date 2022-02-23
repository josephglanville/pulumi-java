// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleSnsAction extends io.pulumi.resources.InvokeArgs {

    public static final TopicRuleSnsAction Empty = new TopicRuleSnsAction();

    @InputImport(name="messageFormat")
      private final @Nullable String messageFormat;

    public Optional<String> getMessageFormat() {
        return this.messageFormat == null ? Optional.empty() : Optional.ofNullable(this.messageFormat);
    }

    @InputImport(name="roleArn", required=true)
      private final String roleArn;

    public String getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="targetArn", required=true)
      private final String targetArn;

    public String getTargetArn() {
        return this.targetArn;
    }

    public TopicRuleSnsAction(
        @Nullable String messageFormat,
        String roleArn,
        String targetArn) {
        this.messageFormat = messageFormat;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.targetArn = Objects.requireNonNull(targetArn, "expected parameter 'targetArn' to be non-null");
    }

    private TopicRuleSnsAction() {
        this.messageFormat = null;
        this.roleArn = null;
        this.targetArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleSnsAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String messageFormat;
        private String roleArn;
        private String targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleSnsAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFormat = defaults.messageFormat;
    	      this.roleArn = defaults.roleArn;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder setMessageFormat(@Nullable String messageFormat) {
            this.messageFormat = messageFormat;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setTargetArn(String targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }
        public TopicRuleSnsAction build() {
            return new TopicRuleSnsAction(messageFormat, roleArn, targetArn);
        }
    }
}
