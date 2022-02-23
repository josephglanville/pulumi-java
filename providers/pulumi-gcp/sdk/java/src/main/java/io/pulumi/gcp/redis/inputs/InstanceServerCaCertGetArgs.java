// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceServerCaCertGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceServerCaCertGetArgs Empty = new InstanceServerCaCertGetArgs();

    @InputImport(name="cert")
      private final @Nullable Input<String> cert;

    public Input<String> getCert() {
        return this.cert == null ? Input.empty() : this.cert;
    }

    /**
     * - 
     * Output only. The time when the policy was created.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    @InputImport(name="createTime")
      private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    @InputImport(name="expireTime")
      private final @Nullable Input<String> expireTime;

    public Input<String> getExpireTime() {
        return this.expireTime == null ? Input.empty() : this.expireTime;
    }

    @InputImport(name="serialNumber")
      private final @Nullable Input<String> serialNumber;

    public Input<String> getSerialNumber() {
        return this.serialNumber == null ? Input.empty() : this.serialNumber;
    }

    @InputImport(name="sha1Fingerprint")
      private final @Nullable Input<String> sha1Fingerprint;

    public Input<String> getSha1Fingerprint() {
        return this.sha1Fingerprint == null ? Input.empty() : this.sha1Fingerprint;
    }

    public InstanceServerCaCertGetArgs(
        @Nullable Input<String> cert,
        @Nullable Input<String> createTime,
        @Nullable Input<String> expireTime,
        @Nullable Input<String> serialNumber,
        @Nullable Input<String> sha1Fingerprint) {
        this.cert = cert;
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.serialNumber = serialNumber;
        this.sha1Fingerprint = sha1Fingerprint;
    }

    private InstanceServerCaCertGetArgs() {
        this.cert = Input.empty();
        this.createTime = Input.empty();
        this.expireTime = Input.empty();
        this.serialNumber = Input.empty();
        this.sha1Fingerprint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceServerCaCertGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cert;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> expireTime;
        private @Nullable Input<String> serialNumber;
        private @Nullable Input<String> sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceServerCaCertGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.serialNumber = defaults.serialNumber;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
        }

        public Builder setCert(@Nullable Input<String> cert) {
            this.cert = cert;
            return this;
        }

        public Builder setCert(@Nullable String cert) {
            this.cert = Input.ofNullable(cert);
            return this;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setExpireTime(@Nullable Input<String> expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        public Builder setExpireTime(@Nullable String expireTime) {
            this.expireTime = Input.ofNullable(expireTime);
            return this;
        }

        public Builder setSerialNumber(@Nullable Input<String> serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Builder setSerialNumber(@Nullable String serialNumber) {
            this.serialNumber = Input.ofNullable(serialNumber);
            return this;
        }

        public Builder setSha1Fingerprint(@Nullable Input<String> sha1Fingerprint) {
            this.sha1Fingerprint = sha1Fingerprint;
            return this;
        }

        public Builder setSha1Fingerprint(@Nullable String sha1Fingerprint) {
            this.sha1Fingerprint = Input.ofNullable(sha1Fingerprint);
            return this;
        }
        public InstanceServerCaCertGetArgs build() {
            return new InstanceServerCaCertGetArgs(cert, createTime, expireTime, serialNumber, sha1Fingerprint);
        }
    }
}
