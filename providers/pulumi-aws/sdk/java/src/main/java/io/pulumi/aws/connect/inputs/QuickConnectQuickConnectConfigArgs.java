// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigPhoneConfigArgs;
import io.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigQueueConfigArgs;
import io.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigUserConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QuickConnectQuickConnectConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuickConnectQuickConnectConfigArgs Empty = new QuickConnectQuickConnectConfigArgs();

    /**
     * Specifies the phone configuration of the Quick Connect. This is required only if `quick_connect_type` is `PHONE_NUMBER`. The `phone_config` block is documented below.
     * 
     */
    @Import(name="phoneConfigs")
      private final @Nullable Output<List<QuickConnectQuickConnectConfigPhoneConfigArgs>> phoneConfigs;

    public Output<List<QuickConnectQuickConnectConfigPhoneConfigArgs>> getPhoneConfigs() {
        return this.phoneConfigs == null ? Output.empty() : this.phoneConfigs;
    }

    /**
     * Specifies the queue configuration of the Quick Connect. This is required only if `quick_connect_type` is `QUEUE`. The `queue_config` block is documented below.
     * 
     */
    @Import(name="queueConfigs")
      private final @Nullable Output<List<QuickConnectQuickConnectConfigQueueConfigArgs>> queueConfigs;

    public Output<List<QuickConnectQuickConnectConfigQueueConfigArgs>> getQueueConfigs() {
        return this.queueConfigs == null ? Output.empty() : this.queueConfigs;
    }

    /**
     * Specifies the configuration type of the quick connect. valid values are `PHONE_NUMBER`, `QUEUE`, `USER`.
     * 
     */
    @Import(name="quickConnectType", required=true)
      private final Output<String> quickConnectType;

    public Output<String> getQuickConnectType() {
        return this.quickConnectType;
    }

    /**
     * Specifies the user configuration of the Quick Connect. This is required only if `quick_connect_type` is `USER`. The `user_config` block is documented below.
     * 
     */
    @Import(name="userConfigs")
      private final @Nullable Output<List<QuickConnectQuickConnectConfigUserConfigArgs>> userConfigs;

    public Output<List<QuickConnectQuickConnectConfigUserConfigArgs>> getUserConfigs() {
        return this.userConfigs == null ? Output.empty() : this.userConfigs;
    }

    public QuickConnectQuickConnectConfigArgs(
        @Nullable Output<List<QuickConnectQuickConnectConfigPhoneConfigArgs>> phoneConfigs,
        @Nullable Output<List<QuickConnectQuickConnectConfigQueueConfigArgs>> queueConfigs,
        Output<String> quickConnectType,
        @Nullable Output<List<QuickConnectQuickConnectConfigUserConfigArgs>> userConfigs) {
        this.phoneConfigs = phoneConfigs;
        this.queueConfigs = queueConfigs;
        this.quickConnectType = Objects.requireNonNull(quickConnectType, "expected parameter 'quickConnectType' to be non-null");
        this.userConfigs = userConfigs;
    }

    private QuickConnectQuickConnectConfigArgs() {
        this.phoneConfigs = Output.empty();
        this.queueConfigs = Output.empty();
        this.quickConnectType = Output.empty();
        this.userConfigs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectQuickConnectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<QuickConnectQuickConnectConfigPhoneConfigArgs>> phoneConfigs;
        private @Nullable Output<List<QuickConnectQuickConnectConfigQueueConfigArgs>> queueConfigs;
        private Output<String> quickConnectType;
        private @Nullable Output<List<QuickConnectQuickConnectConfigUserConfigArgs>> userConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectQuickConnectConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneConfigs = defaults.phoneConfigs;
    	      this.queueConfigs = defaults.queueConfigs;
    	      this.quickConnectType = defaults.quickConnectType;
    	      this.userConfigs = defaults.userConfigs;
        }

        public Builder phoneConfigs(@Nullable Output<List<QuickConnectQuickConnectConfigPhoneConfigArgs>> phoneConfigs) {
            this.phoneConfigs = phoneConfigs;
            return this;
        }
        public Builder phoneConfigs(@Nullable List<QuickConnectQuickConnectConfigPhoneConfigArgs> phoneConfigs) {
            this.phoneConfigs = Output.ofNullable(phoneConfigs);
            return this;
        }
        public Builder phoneConfigs(QuickConnectQuickConnectConfigPhoneConfigArgs... phoneConfigs) {
            return phoneConfigs(List.of(phoneConfigs));
        }
        public Builder queueConfigs(@Nullable Output<List<QuickConnectQuickConnectConfigQueueConfigArgs>> queueConfigs) {
            this.queueConfigs = queueConfigs;
            return this;
        }
        public Builder queueConfigs(@Nullable List<QuickConnectQuickConnectConfigQueueConfigArgs> queueConfigs) {
            this.queueConfigs = Output.ofNullable(queueConfigs);
            return this;
        }
        public Builder queueConfigs(QuickConnectQuickConnectConfigQueueConfigArgs... queueConfigs) {
            return queueConfigs(List.of(queueConfigs));
        }
        public Builder quickConnectType(Output<String> quickConnectType) {
            this.quickConnectType = Objects.requireNonNull(quickConnectType);
            return this;
        }
        public Builder quickConnectType(String quickConnectType) {
            this.quickConnectType = Output.of(Objects.requireNonNull(quickConnectType));
            return this;
        }
        public Builder userConfigs(@Nullable Output<List<QuickConnectQuickConnectConfigUserConfigArgs>> userConfigs) {
            this.userConfigs = userConfigs;
            return this;
        }
        public Builder userConfigs(@Nullable List<QuickConnectQuickConnectConfigUserConfigArgs> userConfigs) {
            this.userConfigs = Output.ofNullable(userConfigs);
            return this;
        }
        public Builder userConfigs(QuickConnectQuickConnectConfigUserConfigArgs... userConfigs) {
            return userConfigs(List.of(userConfigs));
        }        public QuickConnectQuickConnectConfigArgs build() {
            return new QuickConnectQuickConnectConfigArgs(phoneConfigs, queueConfigs, quickConnectType, userConfigs);
        }
    }
}
