// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.BigDataService.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BdsInstanceApiKeyState extends com.pulumi.resources.ResourceArgs {

    public static final BdsInstanceApiKeyState Empty = new BdsInstanceApiKeyState();

    /**
     * The OCID of the cluster.
     * 
     */
    @Import(name="bdsInstanceId")
    private @Nullable Output<String> bdsInstanceId;

    /**
     * @return The OCID of the cluster.
     * 
     */
    public Optional<Output<String>> bdsInstanceId() {
        return Optional.ofNullable(this.bdsInstanceId);
    }

    /**
     * The name of the region to establish the Object Storage endpoint. See https://docs.oracle.com/en-us/iaas/api/#/en/identity/20160918/Region/ for additional information.
     * 
     */
    @Import(name="defaultRegion")
    private @Nullable Output<String> defaultRegion;

    /**
     * @return The name of the region to establish the Object Storage endpoint. See https://docs.oracle.com/en-us/iaas/api/#/en/identity/20160918/Region/ for additional information.
     * 
     */
    public Optional<Output<String>> defaultRegion() {
        return Optional.ofNullable(this.defaultRegion);
    }

    /**
     * The fingerprint that corresponds to the public API key requested.
     * 
     */
    @Import(name="fingerprint")
    private @Nullable Output<String> fingerprint;

    /**
     * @return The fingerprint that corresponds to the public API key requested.
     * 
     */
    public Optional<Output<String>> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }

    /**
     * User friendly identifier used to uniquely differentiate between different API keys associated with this Big Data Service cluster. Only ASCII alphanumeric characters with no spaces allowed.
     * 
     */
    @Import(name="keyAlias")
    private @Nullable Output<String> keyAlias;

    /**
     * @return User friendly identifier used to uniquely differentiate between different API keys associated with this Big Data Service cluster. Only ASCII alphanumeric characters with no spaces allowed.
     * 
     */
    public Optional<Output<String>> keyAlias() {
        return Optional.ofNullable(this.keyAlias);
    }

    /**
     * Base64 passphrase used to secure the private key which will be created on user behalf.
     * 
     */
    @Import(name="passphrase")
    private @Nullable Output<String> passphrase;

    /**
     * @return Base64 passphrase used to secure the private key which will be created on user behalf.
     * 
     */
    public Optional<Output<String>> passphrase() {
        return Optional.ofNullable(this.passphrase);
    }

    /**
     * The full path and file name of the private key used for authentication. This location will be automatically selected on the BDS local file system.
     * 
     */
    @Import(name="pemfilepath")
    private @Nullable Output<String> pemfilepath;

    /**
     * @return The full path and file name of the private key used for authentication. This location will be automatically selected on the BDS local file system.
     * 
     */
    public Optional<Output<String>> pemfilepath() {
        return Optional.ofNullable(this.pemfilepath);
    }

    /**
     * The current status of the API key.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current status of the API key.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The OCID of your tenancy.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The OCID of your tenancy.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * The time the API key was created, shown as an RFC 3339 formatted datetime string.
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The time the API key was created, shown as an RFC 3339 formatted datetime string.
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * The OCID of the user for whom this new generated API key pair will be created.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return The OCID of the user for whom this new generated API key pair will be created.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private BdsInstanceApiKeyState() {}

    private BdsInstanceApiKeyState(BdsInstanceApiKeyState $) {
        this.bdsInstanceId = $.bdsInstanceId;
        this.defaultRegion = $.defaultRegion;
        this.fingerprint = $.fingerprint;
        this.keyAlias = $.keyAlias;
        this.passphrase = $.passphrase;
        this.pemfilepath = $.pemfilepath;
        this.state = $.state;
        this.tenantId = $.tenantId;
        this.timeCreated = $.timeCreated;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BdsInstanceApiKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BdsInstanceApiKeyState $;

        public Builder() {
            $ = new BdsInstanceApiKeyState();
        }

        public Builder(BdsInstanceApiKeyState defaults) {
            $ = new BdsInstanceApiKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bdsInstanceId The OCID of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder bdsInstanceId(@Nullable Output<String> bdsInstanceId) {
            $.bdsInstanceId = bdsInstanceId;
            return this;
        }

        /**
         * @param bdsInstanceId The OCID of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder bdsInstanceId(String bdsInstanceId) {
            return bdsInstanceId(Output.of(bdsInstanceId));
        }

        /**
         * @param defaultRegion The name of the region to establish the Object Storage endpoint. See https://docs.oracle.com/en-us/iaas/api/#/en/identity/20160918/Region/ for additional information.
         * 
         * @return builder
         * 
         */
        public Builder defaultRegion(@Nullable Output<String> defaultRegion) {
            $.defaultRegion = defaultRegion;
            return this;
        }

        /**
         * @param defaultRegion The name of the region to establish the Object Storage endpoint. See https://docs.oracle.com/en-us/iaas/api/#/en/identity/20160918/Region/ for additional information.
         * 
         * @return builder
         * 
         */
        public Builder defaultRegion(String defaultRegion) {
            return defaultRegion(Output.of(defaultRegion));
        }

        /**
         * @param fingerprint The fingerprint that corresponds to the public API key requested.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        /**
         * @param fingerprint The fingerprint that corresponds to the public API key requested.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(String fingerprint) {
            return fingerprint(Output.of(fingerprint));
        }

        /**
         * @param keyAlias User friendly identifier used to uniquely differentiate between different API keys associated with this Big Data Service cluster. Only ASCII alphanumeric characters with no spaces allowed.
         * 
         * @return builder
         * 
         */
        public Builder keyAlias(@Nullable Output<String> keyAlias) {
            $.keyAlias = keyAlias;
            return this;
        }

        /**
         * @param keyAlias User friendly identifier used to uniquely differentiate between different API keys associated with this Big Data Service cluster. Only ASCII alphanumeric characters with no spaces allowed.
         * 
         * @return builder
         * 
         */
        public Builder keyAlias(String keyAlias) {
            return keyAlias(Output.of(keyAlias));
        }

        /**
         * @param passphrase Base64 passphrase used to secure the private key which will be created on user behalf.
         * 
         * @return builder
         * 
         */
        public Builder passphrase(@Nullable Output<String> passphrase) {
            $.passphrase = passphrase;
            return this;
        }

        /**
         * @param passphrase Base64 passphrase used to secure the private key which will be created on user behalf.
         * 
         * @return builder
         * 
         */
        public Builder passphrase(String passphrase) {
            return passphrase(Output.of(passphrase));
        }

        /**
         * @param pemfilepath The full path and file name of the private key used for authentication. This location will be automatically selected on the BDS local file system.
         * 
         * @return builder
         * 
         */
        public Builder pemfilepath(@Nullable Output<String> pemfilepath) {
            $.pemfilepath = pemfilepath;
            return this;
        }

        /**
         * @param pemfilepath The full path and file name of the private key used for authentication. This location will be automatically selected on the BDS local file system.
         * 
         * @return builder
         * 
         */
        public Builder pemfilepath(String pemfilepath) {
            return pemfilepath(Output.of(pemfilepath));
        }

        /**
         * @param state The current status of the API key.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current status of the API key.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tenantId The OCID of your tenancy.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The OCID of your tenancy.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param timeCreated The time the API key was created, shown as an RFC 3339 formatted datetime string.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The time the API key was created, shown as an RFC 3339 formatted datetime string.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param userId The OCID of the user for whom this new generated API key pair will be created.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The OCID of the user for whom this new generated API key pair will be created.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public BdsInstanceApiKeyState build() {
            return $;
        }
    }

}
