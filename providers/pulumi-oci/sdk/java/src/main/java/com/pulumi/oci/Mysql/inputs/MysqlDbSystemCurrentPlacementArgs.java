// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Mysql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MysqlDbSystemCurrentPlacementArgs extends com.pulumi.resources.ResourceArgs {

    public static final MysqlDbSystemCurrentPlacementArgs Empty = new MysqlDbSystemCurrentPlacementArgs();

    /**
     * The availability domain on which to deploy the Read/Write endpoint. This defines the preferred primary instance.
     * 
     */
    @Import(name="availabilityDomain")
    private @Nullable Output<String> availabilityDomain;

    /**
     * @return The availability domain on which to deploy the Read/Write endpoint. This defines the preferred primary instance.
     * 
     */
    public Optional<Output<String>> availabilityDomain() {
        return Optional.ofNullable(this.availabilityDomain);
    }

    /**
     * The fault domain on which to deploy the Read/Write endpoint. This defines the preferred primary instance.
     * 
     */
    @Import(name="faultDomain")
    private @Nullable Output<String> faultDomain;

    /**
     * @return The fault domain on which to deploy the Read/Write endpoint. This defines the preferred primary instance.
     * 
     */
    public Optional<Output<String>> faultDomain() {
        return Optional.ofNullable(this.faultDomain);
    }

    private MysqlDbSystemCurrentPlacementArgs() {}

    private MysqlDbSystemCurrentPlacementArgs(MysqlDbSystemCurrentPlacementArgs $) {
        this.availabilityDomain = $.availabilityDomain;
        this.faultDomain = $.faultDomain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MysqlDbSystemCurrentPlacementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlDbSystemCurrentPlacementArgs $;

        public Builder() {
            $ = new MysqlDbSystemCurrentPlacementArgs();
        }

        public Builder(MysqlDbSystemCurrentPlacementArgs defaults) {
            $ = new MysqlDbSystemCurrentPlacementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityDomain The availability domain on which to deploy the Read/Write endpoint. This defines the preferred primary instance.
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomain(@Nullable Output<String> availabilityDomain) {
            $.availabilityDomain = availabilityDomain;
            return this;
        }

        /**
         * @param availabilityDomain The availability domain on which to deploy the Read/Write endpoint. This defines the preferred primary instance.
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomain(String availabilityDomain) {
            return availabilityDomain(Output.of(availabilityDomain));
        }

        /**
         * @param faultDomain The fault domain on which to deploy the Read/Write endpoint. This defines the preferred primary instance.
         * 
         * @return builder
         * 
         */
        public Builder faultDomain(@Nullable Output<String> faultDomain) {
            $.faultDomain = faultDomain;
            return this;
        }

        /**
         * @param faultDomain The fault domain on which to deploy the Read/Write endpoint. This defines the preferred primary instance.
         * 
         * @return builder
         * 
         */
        public Builder faultDomain(String faultDomain) {
            return faultDomain(Output.of(faultDomain));
        }

        public MysqlDbSystemCurrentPlacementArgs build() {
            return $;
        }
    }

}
