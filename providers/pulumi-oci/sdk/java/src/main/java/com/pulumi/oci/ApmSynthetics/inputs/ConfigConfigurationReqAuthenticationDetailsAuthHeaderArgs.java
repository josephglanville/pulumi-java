// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApmSynthetics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigConfigurationReqAuthenticationDetailsAuthHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigConfigurationReqAuthenticationDetailsAuthHeaderArgs Empty = new ConfigConfigurationReqAuthenticationDetailsAuthHeaderArgs();

    /**
     * (Updatable) Name of the header.
     * 
     */
    @Import(name="headerName")
    private @Nullable Output<String> headerName;

    /**
     * @return (Updatable) Name of the header.
     * 
     */
    public Optional<Output<String>> headerName() {
        return Optional.ofNullable(this.headerName);
    }

    /**
     * (Updatable) Value of the header.
     * 
     */
    @Import(name="headerValue")
    private @Nullable Output<String> headerValue;

    /**
     * @return (Updatable) Value of the header.
     * 
     */
    public Optional<Output<String>> headerValue() {
        return Optional.ofNullable(this.headerValue);
    }

    private ConfigConfigurationReqAuthenticationDetailsAuthHeaderArgs() {}

    private ConfigConfigurationReqAuthenticationDetailsAuthHeaderArgs(ConfigConfigurationReqAuthenticationDetailsAuthHeaderArgs $) {
        this.headerName = $.headerName;
        this.headerValue = $.headerValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigConfigurationReqAuthenticationDetailsAuthHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigConfigurationReqAuthenticationDetailsAuthHeaderArgs $;

        public Builder() {
            $ = new ConfigConfigurationReqAuthenticationDetailsAuthHeaderArgs();
        }

        public Builder(ConfigConfigurationReqAuthenticationDetailsAuthHeaderArgs defaults) {
            $ = new ConfigConfigurationReqAuthenticationDetailsAuthHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headerName (Updatable) Name of the header.
         * 
         * @return builder
         * 
         */
        public Builder headerName(@Nullable Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        /**
         * @param headerName (Updatable) Name of the header.
         * 
         * @return builder
         * 
         */
        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        /**
         * @param headerValue (Updatable) Value of the header.
         * 
         * @return builder
         * 
         */
        public Builder headerValue(@Nullable Output<String> headerValue) {
            $.headerValue = headerValue;
            return this;
        }

        /**
         * @param headerValue (Updatable) Value of the header.
         * 
         * @return builder
         * 
         */
        public Builder headerValue(String headerValue) {
            return headerValue(Output.of(headerValue));
        }

        public ConfigConfigurationReqAuthenticationDetailsAuthHeaderArgs build() {
            return $;
        }
    }

}
