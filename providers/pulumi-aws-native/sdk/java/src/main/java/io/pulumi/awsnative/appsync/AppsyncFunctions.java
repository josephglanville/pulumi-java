// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appsync;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.appsync.inputs.GetDomainNameApiAssociationArgs;
import io.pulumi.awsnative.appsync.inputs.GetDomainNameArgs;
import io.pulumi.awsnative.appsync.outputs.GetDomainNameApiAssociationResult;
import io.pulumi.awsnative.appsync.outputs.GetDomainNameResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AppsyncFunctions {
    /**
     * Resource Type definition for AWS::AppSync::DomainName
     * 
     */
    public static CompletableFuture<GetDomainNameResult> getDomainName(GetDomainNameArgs args) {
        return getDomainName(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDomainNameResult> getDomainName(GetDomainNameArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:appsync:getDomainName", TypeShape.of(GetDomainNameResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::AppSync::DomainNameApiAssociation
     * 
     */
    public static CompletableFuture<GetDomainNameApiAssociationResult> getDomainNameApiAssociation(GetDomainNameApiAssociationArgs args) {
        return getDomainNameApiAssociation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDomainNameApiAssociationResult> getDomainNameApiAssociation(GetDomainNameApiAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:appsync:getDomainNameApiAssociation", TypeShape.of(GetDomainNameApiAssociationResult.class), args, Utilities.withVersion(options));
    }
}
