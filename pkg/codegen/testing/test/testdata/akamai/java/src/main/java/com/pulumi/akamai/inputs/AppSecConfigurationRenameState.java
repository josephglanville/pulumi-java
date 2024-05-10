// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSecConfigurationRenameState extends com.pulumi.resources.ResourceArgs {

    public static final AppSecConfigurationRenameState Empty = new AppSecConfigurationRenameState();

    /**
     * Unique identifier of the security configuration
     * 
     */
    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration
     * 
     */
    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    /**
     * Brief description of the security configuration
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Brief description of the security configuration
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * New name for the security configuration
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return New name for the security configuration
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AppSecConfigurationRenameState() {}

    private AppSecConfigurationRenameState(AppSecConfigurationRenameState $) {
        this.configId = $.configId;
        this.description = $.description;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSecConfigurationRenameState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSecConfigurationRenameState $;

        public Builder() {
            $ = new AppSecConfigurationRenameState();
        }

        public Builder(AppSecConfigurationRenameState defaults) {
            $ = new AppSecConfigurationRenameState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(@Nullable Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param description Brief description of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Brief description of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name New name for the security configuration
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name New name for the security configuration
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AppSecConfigurationRenameState build() {
            return $;
        }
    }

}
