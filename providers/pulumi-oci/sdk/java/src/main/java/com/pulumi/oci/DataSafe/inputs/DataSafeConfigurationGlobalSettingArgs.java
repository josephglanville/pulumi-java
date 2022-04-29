// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSafeConfigurationGlobalSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSafeConfigurationGlobalSettingArgs Empty = new DataSafeConfigurationGlobalSettingArgs();

    /**
     * The paid usage option chosen by the customer admin.
     * 
     */
    @Import(name="isPaidUsage")
    private @Nullable Output<Boolean> isPaidUsage;

    /**
     * @return The paid usage option chosen by the customer admin.
     * 
     */
    public Optional<Output<Boolean>> isPaidUsage() {
        return Optional.ofNullable(this.isPaidUsage);
    }

    /**
     * The offline retention period in months.
     * 
     */
    @Import(name="offlineRetentionPeriod")
    private @Nullable Output<Integer> offlineRetentionPeriod;

    /**
     * @return The offline retention period in months.
     * 
     */
    public Optional<Output<Integer>> offlineRetentionPeriod() {
        return Optional.ofNullable(this.offlineRetentionPeriod);
    }

    /**
     * The online retention period in months.
     * 
     */
    @Import(name="onlineRetentionPeriod")
    private @Nullable Output<Integer> onlineRetentionPeriod;

    /**
     * @return The online retention period in months.
     * 
     */
    public Optional<Output<Integer>> onlineRetentionPeriod() {
        return Optional.ofNullable(this.onlineRetentionPeriod);
    }

    private DataSafeConfigurationGlobalSettingArgs() {}

    private DataSafeConfigurationGlobalSettingArgs(DataSafeConfigurationGlobalSettingArgs $) {
        this.isPaidUsage = $.isPaidUsage;
        this.offlineRetentionPeriod = $.offlineRetentionPeriod;
        this.onlineRetentionPeriod = $.onlineRetentionPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSafeConfigurationGlobalSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSafeConfigurationGlobalSettingArgs $;

        public Builder() {
            $ = new DataSafeConfigurationGlobalSettingArgs();
        }

        public Builder(DataSafeConfigurationGlobalSettingArgs defaults) {
            $ = new DataSafeConfigurationGlobalSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isPaidUsage The paid usage option chosen by the customer admin.
         * 
         * @return builder
         * 
         */
        public Builder isPaidUsage(@Nullable Output<Boolean> isPaidUsage) {
            $.isPaidUsage = isPaidUsage;
            return this;
        }

        /**
         * @param isPaidUsage The paid usage option chosen by the customer admin.
         * 
         * @return builder
         * 
         */
        public Builder isPaidUsage(Boolean isPaidUsage) {
            return isPaidUsage(Output.of(isPaidUsage));
        }

        /**
         * @param offlineRetentionPeriod The offline retention period in months.
         * 
         * @return builder
         * 
         */
        public Builder offlineRetentionPeriod(@Nullable Output<Integer> offlineRetentionPeriod) {
            $.offlineRetentionPeriod = offlineRetentionPeriod;
            return this;
        }

        /**
         * @param offlineRetentionPeriod The offline retention period in months.
         * 
         * @return builder
         * 
         */
        public Builder offlineRetentionPeriod(Integer offlineRetentionPeriod) {
            return offlineRetentionPeriod(Output.of(offlineRetentionPeriod));
        }

        /**
         * @param onlineRetentionPeriod The online retention period in months.
         * 
         * @return builder
         * 
         */
        public Builder onlineRetentionPeriod(@Nullable Output<Integer> onlineRetentionPeriod) {
            $.onlineRetentionPeriod = onlineRetentionPeriod;
            return this;
        }

        /**
         * @param onlineRetentionPeriod The online retention period in months.
         * 
         * @return builder
         * 
         */
        public Builder onlineRetentionPeriod(Integer onlineRetentionPeriod) {
            return onlineRetentionPeriod(Output.of(onlineRetentionPeriod));
        }

        public DataSafeConfigurationGlobalSettingArgs build() {
            return $;
        }
    }

}
