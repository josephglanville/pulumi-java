// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BaiduCredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final BaiduCredentialArgs Empty = new BaiduCredentialArgs();

    @InputImport(name="baiduApiKey")
    private final @Nullable Input<String> baiduApiKey;

    public Input<String> getBaiduApiKey() {
        return this.baiduApiKey == null ? Input.empty() : this.baiduApiKey;
    }

    @InputImport(name="baiduEndPoint")
    private final @Nullable Input<String> baiduEndPoint;

    public Input<String> getBaiduEndPoint() {
        return this.baiduEndPoint == null ? Input.empty() : this.baiduEndPoint;
    }

    @InputImport(name="baiduSecretKey")
    private final @Nullable Input<String> baiduSecretKey;

    public Input<String> getBaiduSecretKey() {
        return this.baiduSecretKey == null ? Input.empty() : this.baiduSecretKey;
    }

    public BaiduCredentialArgs(
        @Nullable Input<String> baiduApiKey,
        @Nullable Input<String> baiduEndPoint,
        @Nullable Input<String> baiduSecretKey) {
        this.baiduApiKey = baiduApiKey;
        this.baiduEndPoint = baiduEndPoint;
        this.baiduSecretKey = baiduSecretKey;
    }

    private BaiduCredentialArgs() {
        this.baiduApiKey = Input.empty();
        this.baiduEndPoint = Input.empty();
        this.baiduSecretKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BaiduCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> baiduApiKey;
        private @Nullable Input<String> baiduEndPoint;
        private @Nullable Input<String> baiduSecretKey;

        public Builder() {
    	      // Empty
        }

        public Builder(BaiduCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baiduApiKey = defaults.baiduApiKey;
    	      this.baiduEndPoint = defaults.baiduEndPoint;
    	      this.baiduSecretKey = defaults.baiduSecretKey;
        }

        public Builder setBaiduApiKey(@Nullable Input<String> baiduApiKey) {
            this.baiduApiKey = baiduApiKey;
            return this;
        }

        public Builder setBaiduApiKey(@Nullable String baiduApiKey) {
            this.baiduApiKey = Input.ofNullable(baiduApiKey);
            return this;
        }

        public Builder setBaiduEndPoint(@Nullable Input<String> baiduEndPoint) {
            this.baiduEndPoint = baiduEndPoint;
            return this;
        }

        public Builder setBaiduEndPoint(@Nullable String baiduEndPoint) {
            this.baiduEndPoint = Input.ofNullable(baiduEndPoint);
            return this;
        }

        public Builder setBaiduSecretKey(@Nullable Input<String> baiduSecretKey) {
            this.baiduSecretKey = baiduSecretKey;
            return this;
        }

        public Builder setBaiduSecretKey(@Nullable String baiduSecretKey) {
            this.baiduSecretKey = Input.ofNullable(baiduSecretKey);
            return this;
        }

        public BaiduCredentialArgs build() {
            return new BaiduCredentialArgs(baiduApiKey, baiduEndPoint, baiduSecretKey);
        }
    }
}
