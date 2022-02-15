// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ConfigMapProjectionArgs;
import io.pulumi.kubernetes.core_v1.inputs.DownwardAPIProjectionArgs;
import io.pulumi.kubernetes.core_v1.inputs.SecretProjectionArgs;
import io.pulumi.kubernetes.core_v1.inputs.ServiceAccountTokenProjectionArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VolumeProjectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeProjectionArgs Empty = new VolumeProjectionArgs();

    @InputImport(name="configMap")
    private final @Nullable Input<ConfigMapProjectionArgs> configMap;

    public Input<ConfigMapProjectionArgs> getConfigMap() {
        return this.configMap == null ? Input.empty() : this.configMap;
    }

    @InputImport(name="downwardAPI")
    private final @Nullable Input<DownwardAPIProjectionArgs> downwardAPI;

    public Input<DownwardAPIProjectionArgs> getDownwardAPI() {
        return this.downwardAPI == null ? Input.empty() : this.downwardAPI;
    }

    @InputImport(name="secret")
    private final @Nullable Input<SecretProjectionArgs> secret;

    public Input<SecretProjectionArgs> getSecret() {
        return this.secret == null ? Input.empty() : this.secret;
    }

    @InputImport(name="serviceAccountToken")
    private final @Nullable Input<ServiceAccountTokenProjectionArgs> serviceAccountToken;

    public Input<ServiceAccountTokenProjectionArgs> getServiceAccountToken() {
        return this.serviceAccountToken == null ? Input.empty() : this.serviceAccountToken;
    }

    public VolumeProjectionArgs(
        @Nullable Input<ConfigMapProjectionArgs> configMap,
        @Nullable Input<DownwardAPIProjectionArgs> downwardAPI,
        @Nullable Input<SecretProjectionArgs> secret,
        @Nullable Input<ServiceAccountTokenProjectionArgs> serviceAccountToken) {
        this.configMap = configMap;
        this.downwardAPI = downwardAPI;
        this.secret = secret;
        this.serviceAccountToken = serviceAccountToken;
    }

    private VolumeProjectionArgs() {
        this.configMap = Input.empty();
        this.downwardAPI = Input.empty();
        this.secret = Input.empty();
        this.serviceAccountToken = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeProjectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigMapProjectionArgs> configMap;
        private @Nullable Input<DownwardAPIProjectionArgs> downwardAPI;
        private @Nullable Input<SecretProjectionArgs> secret;
        private @Nullable Input<ServiceAccountTokenProjectionArgs> serviceAccountToken;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeProjectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMap = defaults.configMap;
    	      this.downwardAPI = defaults.downwardAPI;
    	      this.secret = defaults.secret;
    	      this.serviceAccountToken = defaults.serviceAccountToken;
        }

        public Builder setConfigMap(@Nullable Input<ConfigMapProjectionArgs> configMap) {
            this.configMap = configMap;
            return this;
        }

        public Builder setConfigMap(@Nullable ConfigMapProjectionArgs configMap) {
            this.configMap = Input.ofNullable(configMap);
            return this;
        }

        public Builder setDownwardAPI(@Nullable Input<DownwardAPIProjectionArgs> downwardAPI) {
            this.downwardAPI = downwardAPI;
            return this;
        }

        public Builder setDownwardAPI(@Nullable DownwardAPIProjectionArgs downwardAPI) {
            this.downwardAPI = Input.ofNullable(downwardAPI);
            return this;
        }

        public Builder setSecret(@Nullable Input<SecretProjectionArgs> secret) {
            this.secret = secret;
            return this;
        }

        public Builder setSecret(@Nullable SecretProjectionArgs secret) {
            this.secret = Input.ofNullable(secret);
            return this;
        }

        public Builder setServiceAccountToken(@Nullable Input<ServiceAccountTokenProjectionArgs> serviceAccountToken) {
            this.serviceAccountToken = serviceAccountToken;
            return this;
        }

        public Builder setServiceAccountToken(@Nullable ServiceAccountTokenProjectionArgs serviceAccountToken) {
            this.serviceAccountToken = Input.ofNullable(serviceAccountToken);
            return this;
        }

        public VolumeProjectionArgs build() {
            return new VolumeProjectionArgs(configMap, downwardAPI, secret, serviceAccountToken);
        }
    }
}