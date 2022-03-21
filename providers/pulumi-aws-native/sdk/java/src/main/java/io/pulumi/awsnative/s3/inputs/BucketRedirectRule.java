// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketRedirectRuleProtocol;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies how requests are redirected. In the event of an error, you can specify a different error code to return.
 * 
 */
public final class BucketRedirectRule extends io.pulumi.resources.InvokeArgs {

    public static final BucketRedirectRule Empty = new BucketRedirectRule();

    /**
     * The host name to use in the redirect request.
     * 
     */
    @Import(name="hostName")
      private final @Nullable String hostName;

    public Optional<String> getHostName() {
        return this.hostName == null ? Optional.empty() : Optional.ofNullable(this.hostName);
    }

    /**
     * The HTTP redirect code to use on the response. Not required if one of the siblings is present.
     * 
     */
    @Import(name="httpRedirectCode")
      private final @Nullable String httpRedirectCode;

    public Optional<String> getHttpRedirectCode() {
        return this.httpRedirectCode == null ? Optional.empty() : Optional.ofNullable(this.httpRedirectCode);
    }

    /**
     * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     * 
     */
    @Import(name="protocol")
      private final @Nullable BucketRedirectRuleProtocol protocol;

    public Optional<BucketRedirectRuleProtocol> getProtocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    /**
     * The object key prefix to use in the redirect request.
     * 
     */
    @Import(name="replaceKeyPrefixWith")
      private final @Nullable String replaceKeyPrefixWith;

    public Optional<String> getReplaceKeyPrefixWith() {
        return this.replaceKeyPrefixWith == null ? Optional.empty() : Optional.ofNullable(this.replaceKeyPrefixWith);
    }

    /**
     * The specific object key to use in the redirect request.d
     * 
     */
    @Import(name="replaceKeyWith")
      private final @Nullable String replaceKeyWith;

    public Optional<String> getReplaceKeyWith() {
        return this.replaceKeyWith == null ? Optional.empty() : Optional.ofNullable(this.replaceKeyWith);
    }

    public BucketRedirectRule(
        @Nullable String hostName,
        @Nullable String httpRedirectCode,
        @Nullable BucketRedirectRuleProtocol protocol,
        @Nullable String replaceKeyPrefixWith,
        @Nullable String replaceKeyWith) {
        this.hostName = hostName;
        this.httpRedirectCode = httpRedirectCode;
        this.protocol = protocol;
        this.replaceKeyPrefixWith = replaceKeyPrefixWith;
        this.replaceKeyWith = replaceKeyWith;
    }

    private BucketRedirectRule() {
        this.hostName = null;
        this.httpRedirectCode = null;
        this.protocol = null;
        this.replaceKeyPrefixWith = null;
        this.replaceKeyWith = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRedirectRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostName;
        private @Nullable String httpRedirectCode;
        private @Nullable BucketRedirectRuleProtocol protocol;
        private @Nullable String replaceKeyPrefixWith;
        private @Nullable String replaceKeyWith;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRedirectRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.httpRedirectCode = defaults.httpRedirectCode;
    	      this.protocol = defaults.protocol;
    	      this.replaceKeyPrefixWith = defaults.replaceKeyPrefixWith;
    	      this.replaceKeyWith = defaults.replaceKeyWith;
        }

        public Builder hostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }
        public Builder httpRedirectCode(@Nullable String httpRedirectCode) {
            this.httpRedirectCode = httpRedirectCode;
            return this;
        }
        public Builder protocol(@Nullable BucketRedirectRuleProtocol protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder replaceKeyPrefixWith(@Nullable String replaceKeyPrefixWith) {
            this.replaceKeyPrefixWith = replaceKeyPrefixWith;
            return this;
        }
        public Builder replaceKeyWith(@Nullable String replaceKeyWith) {
            this.replaceKeyWith = replaceKeyWith;
            return this;
        }        public BucketRedirectRule build() {
            return new BucketRedirectRule(hostName, httpRedirectCode, protocol, replaceKeyPrefixWith, replaceKeyWith);
        }
    }
}
