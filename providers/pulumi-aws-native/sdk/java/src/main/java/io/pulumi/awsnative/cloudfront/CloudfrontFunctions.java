// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudfront.inputs.GetCachePolicyArgs;
import io.pulumi.awsnative.cloudfront.inputs.GetCloudFrontOriginAccessIdentityArgs;
import io.pulumi.awsnative.cloudfront.inputs.GetDistributionArgs;
import io.pulumi.awsnative.cloudfront.inputs.GetFunctionArgs;
import io.pulumi.awsnative.cloudfront.inputs.GetKeyGroupArgs;
import io.pulumi.awsnative.cloudfront.inputs.GetOriginRequestPolicyArgs;
import io.pulumi.awsnative.cloudfront.inputs.GetPublicKeyArgs;
import io.pulumi.awsnative.cloudfront.inputs.GetRealtimeLogConfigArgs;
import io.pulumi.awsnative.cloudfront.inputs.GetResponseHeadersPolicyArgs;
import io.pulumi.awsnative.cloudfront.outputs.GetCachePolicyResult;
import io.pulumi.awsnative.cloudfront.outputs.GetCloudFrontOriginAccessIdentityResult;
import io.pulumi.awsnative.cloudfront.outputs.GetDistributionResult;
import io.pulumi.awsnative.cloudfront.outputs.GetFunctionResult;
import io.pulumi.awsnative.cloudfront.outputs.GetKeyGroupResult;
import io.pulumi.awsnative.cloudfront.outputs.GetOriginRequestPolicyResult;
import io.pulumi.awsnative.cloudfront.outputs.GetPublicKeyResult;
import io.pulumi.awsnative.cloudfront.outputs.GetRealtimeLogConfigResult;
import io.pulumi.awsnative.cloudfront.outputs.GetResponseHeadersPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CloudfrontFunctions {
    /**
     * Resource Type definition for AWS::CloudFront::CachePolicy
     * 
     */
    public static CompletableFuture<GetCachePolicyResult> getCachePolicy(GetCachePolicyArgs args) {
        return getCachePolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCachePolicyResult> getCachePolicy(GetCachePolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getCachePolicy", TypeShape.of(GetCachePolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::CloudFront::CloudFrontOriginAccessIdentity
     * 
     */
    public static CompletableFuture<GetCloudFrontOriginAccessIdentityResult> getCloudFrontOriginAccessIdentity(GetCloudFrontOriginAccessIdentityArgs args) {
        return getCloudFrontOriginAccessIdentity(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCloudFrontOriginAccessIdentityResult> getCloudFrontOriginAccessIdentity(GetCloudFrontOriginAccessIdentityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getCloudFrontOriginAccessIdentity", TypeShape.of(GetCloudFrontOriginAccessIdentityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::CloudFront::Distribution
     * 
     */
    public static CompletableFuture<GetDistributionResult> getDistribution(GetDistributionArgs args) {
        return getDistribution(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDistributionResult> getDistribution(GetDistributionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getDistribution", TypeShape.of(GetDistributionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::CloudFront::Function
     * 
     */
    public static CompletableFuture<GetFunctionResult> getFunction(GetFunctionArgs args) {
        return getFunction(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFunctionResult> getFunction(GetFunctionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getFunction", TypeShape.of(GetFunctionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::CloudFront::KeyGroup
     * 
     */
    public static CompletableFuture<GetKeyGroupResult> getKeyGroup(GetKeyGroupArgs args) {
        return getKeyGroup(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKeyGroupResult> getKeyGroup(GetKeyGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getKeyGroup", TypeShape.of(GetKeyGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::CloudFront::OriginRequestPolicy
     * 
     */
    public static CompletableFuture<GetOriginRequestPolicyResult> getOriginRequestPolicy(GetOriginRequestPolicyArgs args) {
        return getOriginRequestPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOriginRequestPolicyResult> getOriginRequestPolicy(GetOriginRequestPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getOriginRequestPolicy", TypeShape.of(GetOriginRequestPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::CloudFront::PublicKey
     * 
     */
    public static CompletableFuture<GetPublicKeyResult> getPublicKey(GetPublicKeyArgs args) {
        return getPublicKey(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPublicKeyResult> getPublicKey(GetPublicKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getPublicKey", TypeShape.of(GetPublicKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::CloudFront::RealtimeLogConfig
     * 
     */
    public static CompletableFuture<GetRealtimeLogConfigResult> getRealtimeLogConfig(GetRealtimeLogConfigArgs args) {
        return getRealtimeLogConfig(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRealtimeLogConfigResult> getRealtimeLogConfig(GetRealtimeLogConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getRealtimeLogConfig", TypeShape.of(GetRealtimeLogConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::CloudFront::ResponseHeadersPolicy
     * 
     */
    public static CompletableFuture<GetResponseHeadersPolicyResult> getResponseHeadersPolicy(GetResponseHeadersPolicyArgs args) {
        return getResponseHeadersPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetResponseHeadersPolicyResult> getResponseHeadersPolicy(GetResponseHeadersPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getResponseHeadersPolicy", TypeShape.of(GetResponseHeadersPolicyResult.class), args, Utilities.withVersion(options));
    }
}
