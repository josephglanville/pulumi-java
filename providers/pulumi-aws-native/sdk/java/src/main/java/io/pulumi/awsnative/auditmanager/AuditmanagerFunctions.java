// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.auditmanager;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.auditmanager.inputs.GetAssessmentArgs;
import io.pulumi.awsnative.auditmanager.outputs.GetAssessmentResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AuditmanagerFunctions {
    /**
     * An entity that defines the scope of audit evidence collected by AWS Audit Manager.
     * 
     */
    public static CompletableFuture<GetAssessmentResult> getAssessment(GetAssessmentArgs args) {
        return getAssessment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAssessmentResult> getAssessment(GetAssessmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:auditmanager:getAssessment", TypeShape.of(GetAssessmentResult.class), args, Utilities.withVersion(options));
    }
}
