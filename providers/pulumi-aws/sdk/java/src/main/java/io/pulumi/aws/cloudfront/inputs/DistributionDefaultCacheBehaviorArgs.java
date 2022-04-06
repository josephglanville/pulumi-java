// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorForwardedValuesArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorFunctionAssociationArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorLambdaFunctionAssociationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionDefaultCacheBehaviorArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionDefaultCacheBehaviorArgs Empty = new DistributionDefaultCacheBehaviorArgs();

    /**
     * Controls which HTTP methods CloudFront
     * processes and forwards to your Amazon S3 bucket or your custom origin.
     * 
     */
    @Import(name="allowedMethods", required=true)
      private final Output<List<String>> allowedMethods;

    public Output<List<String>> getAllowedMethods() {
        return this.allowedMethods;
    }

    /**
     * The unique identifier of the cache policy that
     * is attached to the cache behavior.
     * 
     */
    @Import(name="cachePolicyId")
      private final @Nullable Output<String> cachePolicyId;

    public Output<String> getCachePolicyId() {
        return this.cachePolicyId == null ? Output.empty() : this.cachePolicyId;
    }

    /**
     * Controls whether CloudFront caches the
     * response to requests using the specified HTTP methods.
     * 
     */
    @Import(name="cachedMethods", required=true)
      private final Output<List<String>> cachedMethods;

    public Output<List<String>> getCachedMethods() {
        return this.cachedMethods;
    }

    /**
     * Whether you want CloudFront to automatically
     * compress content for web requests that include `Accept-Encoding: gzip` in
     * the request header (default: `false`).
     * 
     */
    @Import(name="compress")
      private final @Nullable Output<Boolean> compress;

    public Output<Boolean> getCompress() {
        return this.compress == null ? Output.empty() : this.compress;
    }

    /**
     * The default amount of time (in seconds) that an
     * object is in a CloudFront cache before CloudFront forwards another request
     * in the absence of an `Cache-Control max-age` or `Expires` header.
     * 
     */
    @Import(name="defaultTtl")
      private final @Nullable Output<Integer> defaultTtl;

    public Output<Integer> getDefaultTtl() {
        return this.defaultTtl == null ? Output.empty() : this.defaultTtl;
    }

    /**
     * Field level encryption configuration ID
     * 
     */
    @Import(name="fieldLevelEncryptionId")
      private final @Nullable Output<String> fieldLevelEncryptionId;

    public Output<String> getFieldLevelEncryptionId() {
        return this.fieldLevelEncryptionId == null ? Output.empty() : this.fieldLevelEncryptionId;
    }

    /**
     * The forwarded values configuration that specifies how CloudFront
     * handles query strings, cookies and headers (maximum one).
     * 
     */
    @Import(name="forwardedValues")
      private final @Nullable Output<DistributionDefaultCacheBehaviorForwardedValuesArgs> forwardedValues;

    public Output<DistributionDefaultCacheBehaviorForwardedValuesArgs> getForwardedValues() {
        return this.forwardedValues == null ? Output.empty() : this.forwardedValues;
    }

    /**
     * A config block that triggers a cloudfront
     * function with specific actions (maximum 2).
     * 
     */
    @Import(name="functionAssociations")
      private final @Nullable Output<List<DistributionDefaultCacheBehaviorFunctionAssociationArgs>> functionAssociations;

    public Output<List<DistributionDefaultCacheBehaviorFunctionAssociationArgs>> getFunctionAssociations() {
        return this.functionAssociations == null ? Output.empty() : this.functionAssociations;
    }

    /**
     * A config block that triggers a lambda
     * function with specific actions (maximum 4).
     * 
     */
    @Import(name="lambdaFunctionAssociations")
      private final @Nullable Output<List<DistributionDefaultCacheBehaviorLambdaFunctionAssociationArgs>> lambdaFunctionAssociations;

    public Output<List<DistributionDefaultCacheBehaviorLambdaFunctionAssociationArgs>> getLambdaFunctionAssociations() {
        return this.lambdaFunctionAssociations == null ? Output.empty() : this.lambdaFunctionAssociations;
    }

    /**
     * The maximum amount of time (in seconds) that an
     * object is in a CloudFront cache before CloudFront forwards another request
     * to your origin to determine whether the object has been updated. Only
     * effective in the presence of `Cache-Control max-age`, `Cache-Control
     * s-maxage`, and `Expires` headers.
     * 
     */
    @Import(name="maxTtl")
      private final @Nullable Output<Integer> maxTtl;

    public Output<Integer> getMaxTtl() {
        return this.maxTtl == null ? Output.empty() : this.maxTtl;
    }

    /**
     * The minimum amount of time that you want objects to
     * stay in CloudFront caches before CloudFront queries your origin to see
     * whether the object has been updated. Defaults to 0 seconds.
     * 
     */
    @Import(name="minTtl")
      private final @Nullable Output<Integer> minTtl;

    public Output<Integer> getMinTtl() {
        return this.minTtl == null ? Output.empty() : this.minTtl;
    }

    /**
     * The unique identifier of the origin request policy
     * that is attached to the behavior.
     * 
     */
    @Import(name="originRequestPolicyId")
      private final @Nullable Output<String> originRequestPolicyId;

    public Output<String> getOriginRequestPolicyId() {
        return this.originRequestPolicyId == null ? Output.empty() : this.originRequestPolicyId;
    }

    /**
     * The ARN of the real-time log configuration
     * that is attached to this cache behavior.
     * 
     */
    @Import(name="realtimeLogConfigArn")
      private final @Nullable Output<String> realtimeLogConfigArn;

    public Output<String> getRealtimeLogConfigArn() {
        return this.realtimeLogConfigArn == null ? Output.empty() : this.realtimeLogConfigArn;
    }

    /**
     * The identifier for a response headers policy.
     * 
     */
    @Import(name="responseHeadersPolicyId")
      private final @Nullable Output<String> responseHeadersPolicyId;

    public Output<String> getResponseHeadersPolicyId() {
        return this.responseHeadersPolicyId == null ? Output.empty() : this.responseHeadersPolicyId;
    }

    /**
     * Indicates whether you want to distribute
     * media files in Microsoft Smooth Streaming format using the origin that is
     * associated with this cache behavior.
     * 
     */
    @Import(name="smoothStreaming")
      private final @Nullable Output<Boolean> smoothStreaming;

    public Output<Boolean> getSmoothStreaming() {
        return this.smoothStreaming == null ? Output.empty() : this.smoothStreaming;
    }

    /**
     * The value of ID for the origin that you want
     * CloudFront to route requests to when a request matches the path pattern
     * either for a cache behavior or for the default cache behavior.
     * 
     */
    @Import(name="targetOriginId", required=true)
      private final Output<String> targetOriginId;

    public Output<String> getTargetOriginId() {
        return this.targetOriginId;
    }

    /**
     * A list of key group IDs that CloudFront can use to validate signed URLs or signed cookies.
     * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
     * 
     */
    @Import(name="trustedKeyGroups")
      private final @Nullable Output<List<String>> trustedKeyGroups;

    public Output<List<String>> getTrustedKeyGroups() {
        return this.trustedKeyGroups == null ? Output.empty() : this.trustedKeyGroups;
    }

    /**
     * List of AWS account IDs (or `self`) that you want to allow to create signed URLs for private content.
     * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
     * 
     */
    @Import(name="trustedSigners")
      private final @Nullable Output<List<String>> trustedSigners;

    public Output<List<String>> getTrustedSigners() {
        return this.trustedSigners == null ? Output.empty() : this.trustedSigners;
    }

    /**
     * Use this element to specify the
     * protocol that users can use to access the files in the origin specified by
     * TargetOriginId when a request matches the path pattern in PathPattern. One
     * of `allow-all`, `https-only`, or `redirect-to-https`.
     * 
     */
    @Import(name="viewerProtocolPolicy", required=true)
      private final Output<String> viewerProtocolPolicy;

    public Output<String> getViewerProtocolPolicy() {
        return this.viewerProtocolPolicy;
    }

    public DistributionDefaultCacheBehaviorArgs(
        Output<List<String>> allowedMethods,
        @Nullable Output<String> cachePolicyId,
        Output<List<String>> cachedMethods,
        @Nullable Output<Boolean> compress,
        @Nullable Output<Integer> defaultTtl,
        @Nullable Output<String> fieldLevelEncryptionId,
        @Nullable Output<DistributionDefaultCacheBehaviorForwardedValuesArgs> forwardedValues,
        @Nullable Output<List<DistributionDefaultCacheBehaviorFunctionAssociationArgs>> functionAssociations,
        @Nullable Output<List<DistributionDefaultCacheBehaviorLambdaFunctionAssociationArgs>> lambdaFunctionAssociations,
        @Nullable Output<Integer> maxTtl,
        @Nullable Output<Integer> minTtl,
        @Nullable Output<String> originRequestPolicyId,
        @Nullable Output<String> realtimeLogConfigArn,
        @Nullable Output<String> responseHeadersPolicyId,
        @Nullable Output<Boolean> smoothStreaming,
        Output<String> targetOriginId,
        @Nullable Output<List<String>> trustedKeyGroups,
        @Nullable Output<List<String>> trustedSigners,
        Output<String> viewerProtocolPolicy) {
        this.allowedMethods = Objects.requireNonNull(allowedMethods, "expected parameter 'allowedMethods' to be non-null");
        this.cachePolicyId = cachePolicyId;
        this.cachedMethods = Objects.requireNonNull(cachedMethods, "expected parameter 'cachedMethods' to be non-null");
        this.compress = compress;
        this.defaultTtl = defaultTtl;
        this.fieldLevelEncryptionId = fieldLevelEncryptionId;
        this.forwardedValues = forwardedValues;
        this.functionAssociations = functionAssociations;
        this.lambdaFunctionAssociations = lambdaFunctionAssociations;
        this.maxTtl = maxTtl;
        this.minTtl = minTtl;
        this.originRequestPolicyId = originRequestPolicyId;
        this.realtimeLogConfigArn = realtimeLogConfigArn;
        this.responseHeadersPolicyId = responseHeadersPolicyId;
        this.smoothStreaming = smoothStreaming;
        this.targetOriginId = Objects.requireNonNull(targetOriginId, "expected parameter 'targetOriginId' to be non-null");
        this.trustedKeyGroups = trustedKeyGroups;
        this.trustedSigners = trustedSigners;
        this.viewerProtocolPolicy = Objects.requireNonNull(viewerProtocolPolicy, "expected parameter 'viewerProtocolPolicy' to be non-null");
    }

    private DistributionDefaultCacheBehaviorArgs() {
        this.allowedMethods = Output.empty();
        this.cachePolicyId = Output.empty();
        this.cachedMethods = Output.empty();
        this.compress = Output.empty();
        this.defaultTtl = Output.empty();
        this.fieldLevelEncryptionId = Output.empty();
        this.forwardedValues = Output.empty();
        this.functionAssociations = Output.empty();
        this.lambdaFunctionAssociations = Output.empty();
        this.maxTtl = Output.empty();
        this.minTtl = Output.empty();
        this.originRequestPolicyId = Output.empty();
        this.realtimeLogConfigArn = Output.empty();
        this.responseHeadersPolicyId = Output.empty();
        this.smoothStreaming = Output.empty();
        this.targetOriginId = Output.empty();
        this.trustedKeyGroups = Output.empty();
        this.trustedSigners = Output.empty();
        this.viewerProtocolPolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionDefaultCacheBehaviorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> allowedMethods;
        private @Nullable Output<String> cachePolicyId;
        private Output<List<String>> cachedMethods;
        private @Nullable Output<Boolean> compress;
        private @Nullable Output<Integer> defaultTtl;
        private @Nullable Output<String> fieldLevelEncryptionId;
        private @Nullable Output<DistributionDefaultCacheBehaviorForwardedValuesArgs> forwardedValues;
        private @Nullable Output<List<DistributionDefaultCacheBehaviorFunctionAssociationArgs>> functionAssociations;
        private @Nullable Output<List<DistributionDefaultCacheBehaviorLambdaFunctionAssociationArgs>> lambdaFunctionAssociations;
        private @Nullable Output<Integer> maxTtl;
        private @Nullable Output<Integer> minTtl;
        private @Nullable Output<String> originRequestPolicyId;
        private @Nullable Output<String> realtimeLogConfigArn;
        private @Nullable Output<String> responseHeadersPolicyId;
        private @Nullable Output<Boolean> smoothStreaming;
        private Output<String> targetOriginId;
        private @Nullable Output<List<String>> trustedKeyGroups;
        private @Nullable Output<List<String>> trustedSigners;
        private Output<String> viewerProtocolPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionDefaultCacheBehaviorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.cachePolicyId = defaults.cachePolicyId;
    	      this.cachedMethods = defaults.cachedMethods;
    	      this.compress = defaults.compress;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.fieldLevelEncryptionId = defaults.fieldLevelEncryptionId;
    	      this.forwardedValues = defaults.forwardedValues;
    	      this.functionAssociations = defaults.functionAssociations;
    	      this.lambdaFunctionAssociations = defaults.lambdaFunctionAssociations;
    	      this.maxTtl = defaults.maxTtl;
    	      this.minTtl = defaults.minTtl;
    	      this.originRequestPolicyId = defaults.originRequestPolicyId;
    	      this.realtimeLogConfigArn = defaults.realtimeLogConfigArn;
    	      this.responseHeadersPolicyId = defaults.responseHeadersPolicyId;
    	      this.smoothStreaming = defaults.smoothStreaming;
    	      this.targetOriginId = defaults.targetOriginId;
    	      this.trustedKeyGroups = defaults.trustedKeyGroups;
    	      this.trustedSigners = defaults.trustedSigners;
    	      this.viewerProtocolPolicy = defaults.viewerProtocolPolicy;
        }

        public Builder allowedMethods(Output<List<String>> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }
        public Builder allowedMethods(List<String> allowedMethods) {
            this.allowedMethods = Output.of(Objects.requireNonNull(allowedMethods));
            return this;
        }
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }
        public Builder cachePolicyId(@Nullable Output<String> cachePolicyId) {
            this.cachePolicyId = cachePolicyId;
            return this;
        }
        public Builder cachePolicyId(@Nullable String cachePolicyId) {
            this.cachePolicyId = Output.ofNullable(cachePolicyId);
            return this;
        }
        public Builder cachedMethods(Output<List<String>> cachedMethods) {
            this.cachedMethods = Objects.requireNonNull(cachedMethods);
            return this;
        }
        public Builder cachedMethods(List<String> cachedMethods) {
            this.cachedMethods = Output.of(Objects.requireNonNull(cachedMethods));
            return this;
        }
        public Builder cachedMethods(String... cachedMethods) {
            return cachedMethods(List.of(cachedMethods));
        }
        public Builder compress(@Nullable Output<Boolean> compress) {
            this.compress = compress;
            return this;
        }
        public Builder compress(@Nullable Boolean compress) {
            this.compress = Output.ofNullable(compress);
            return this;
        }
        public Builder defaultTtl(@Nullable Output<Integer> defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }
        public Builder defaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = Output.ofNullable(defaultTtl);
            return this;
        }
        public Builder fieldLevelEncryptionId(@Nullable Output<String> fieldLevelEncryptionId) {
            this.fieldLevelEncryptionId = fieldLevelEncryptionId;
            return this;
        }
        public Builder fieldLevelEncryptionId(@Nullable String fieldLevelEncryptionId) {
            this.fieldLevelEncryptionId = Output.ofNullable(fieldLevelEncryptionId);
            return this;
        }
        public Builder forwardedValues(@Nullable Output<DistributionDefaultCacheBehaviorForwardedValuesArgs> forwardedValues) {
            this.forwardedValues = forwardedValues;
            return this;
        }
        public Builder forwardedValues(@Nullable DistributionDefaultCacheBehaviorForwardedValuesArgs forwardedValues) {
            this.forwardedValues = Output.ofNullable(forwardedValues);
            return this;
        }
        public Builder functionAssociations(@Nullable Output<List<DistributionDefaultCacheBehaviorFunctionAssociationArgs>> functionAssociations) {
            this.functionAssociations = functionAssociations;
            return this;
        }
        public Builder functionAssociations(@Nullable List<DistributionDefaultCacheBehaviorFunctionAssociationArgs> functionAssociations) {
            this.functionAssociations = Output.ofNullable(functionAssociations);
            return this;
        }
        public Builder functionAssociations(DistributionDefaultCacheBehaviorFunctionAssociationArgs... functionAssociations) {
            return functionAssociations(List.of(functionAssociations));
        }
        public Builder lambdaFunctionAssociations(@Nullable Output<List<DistributionDefaultCacheBehaviorLambdaFunctionAssociationArgs>> lambdaFunctionAssociations) {
            this.lambdaFunctionAssociations = lambdaFunctionAssociations;
            return this;
        }
        public Builder lambdaFunctionAssociations(@Nullable List<DistributionDefaultCacheBehaviorLambdaFunctionAssociationArgs> lambdaFunctionAssociations) {
            this.lambdaFunctionAssociations = Output.ofNullable(lambdaFunctionAssociations);
            return this;
        }
        public Builder lambdaFunctionAssociations(DistributionDefaultCacheBehaviorLambdaFunctionAssociationArgs... lambdaFunctionAssociations) {
            return lambdaFunctionAssociations(List.of(lambdaFunctionAssociations));
        }
        public Builder maxTtl(@Nullable Output<Integer> maxTtl) {
            this.maxTtl = maxTtl;
            return this;
        }
        public Builder maxTtl(@Nullable Integer maxTtl) {
            this.maxTtl = Output.ofNullable(maxTtl);
            return this;
        }
        public Builder minTtl(@Nullable Output<Integer> minTtl) {
            this.minTtl = minTtl;
            return this;
        }
        public Builder minTtl(@Nullable Integer minTtl) {
            this.minTtl = Output.ofNullable(minTtl);
            return this;
        }
        public Builder originRequestPolicyId(@Nullable Output<String> originRequestPolicyId) {
            this.originRequestPolicyId = originRequestPolicyId;
            return this;
        }
        public Builder originRequestPolicyId(@Nullable String originRequestPolicyId) {
            this.originRequestPolicyId = Output.ofNullable(originRequestPolicyId);
            return this;
        }
        public Builder realtimeLogConfigArn(@Nullable Output<String> realtimeLogConfigArn) {
            this.realtimeLogConfigArn = realtimeLogConfigArn;
            return this;
        }
        public Builder realtimeLogConfigArn(@Nullable String realtimeLogConfigArn) {
            this.realtimeLogConfigArn = Output.ofNullable(realtimeLogConfigArn);
            return this;
        }
        public Builder responseHeadersPolicyId(@Nullable Output<String> responseHeadersPolicyId) {
            this.responseHeadersPolicyId = responseHeadersPolicyId;
            return this;
        }
        public Builder responseHeadersPolicyId(@Nullable String responseHeadersPolicyId) {
            this.responseHeadersPolicyId = Output.ofNullable(responseHeadersPolicyId);
            return this;
        }
        public Builder smoothStreaming(@Nullable Output<Boolean> smoothStreaming) {
            this.smoothStreaming = smoothStreaming;
            return this;
        }
        public Builder smoothStreaming(@Nullable Boolean smoothStreaming) {
            this.smoothStreaming = Output.ofNullable(smoothStreaming);
            return this;
        }
        public Builder targetOriginId(Output<String> targetOriginId) {
            this.targetOriginId = Objects.requireNonNull(targetOriginId);
            return this;
        }
        public Builder targetOriginId(String targetOriginId) {
            this.targetOriginId = Output.of(Objects.requireNonNull(targetOriginId));
            return this;
        }
        public Builder trustedKeyGroups(@Nullable Output<List<String>> trustedKeyGroups) {
            this.trustedKeyGroups = trustedKeyGroups;
            return this;
        }
        public Builder trustedKeyGroups(@Nullable List<String> trustedKeyGroups) {
            this.trustedKeyGroups = Output.ofNullable(trustedKeyGroups);
            return this;
        }
        public Builder trustedKeyGroups(String... trustedKeyGroups) {
            return trustedKeyGroups(List.of(trustedKeyGroups));
        }
        public Builder trustedSigners(@Nullable Output<List<String>> trustedSigners) {
            this.trustedSigners = trustedSigners;
            return this;
        }
        public Builder trustedSigners(@Nullable List<String> trustedSigners) {
            this.trustedSigners = Output.ofNullable(trustedSigners);
            return this;
        }
        public Builder trustedSigners(String... trustedSigners) {
            return trustedSigners(List.of(trustedSigners));
        }
        public Builder viewerProtocolPolicy(Output<String> viewerProtocolPolicy) {
            this.viewerProtocolPolicy = Objects.requireNonNull(viewerProtocolPolicy);
            return this;
        }
        public Builder viewerProtocolPolicy(String viewerProtocolPolicy) {
            this.viewerProtocolPolicy = Output.of(Objects.requireNonNull(viewerProtocolPolicy));
            return this;
        }        public DistributionDefaultCacheBehaviorArgs build() {
            return new DistributionDefaultCacheBehaviorArgs(allowedMethods, cachePolicyId, cachedMethods, compress, defaultTtl, fieldLevelEncryptionId, forwardedValues, functionAssociations, lambdaFunctionAssociations, maxTtl, minTtl, originRequestPolicyId, realtimeLogConfigArn, responseHeadersPolicyId, smoothStreaming, targetOriginId, trustedKeyGroups, trustedSigners, viewerProtocolPolicy);
        }
    }
}