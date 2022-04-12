// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acm;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.acm.inputs.GetCertificateArgs;
import io.pulumi.aws.acm.outputs.GetCertificateResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AcmFunctions {
    /**
     * Use this data source to get the ARN of a certificate in AWS Certificate
     * Manager (ACM), you can reference
     * it by domain without having to hard code the ARNs as input.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificate(GetCertificateArgs args) {
        return getCertificate(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCertificateResult> getCertificate(GetCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:acm/getCertificate:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
}
