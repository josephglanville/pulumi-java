// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.billing;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.billing.inputs.GetBillingRoleAssignmentByEnrollmentAccountArgs;
import io.pulumi.azurenative.billing.outputs.GetBillingRoleAssignmentByEnrollmentAccountResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBillingRoleAssignmentByEnrollmentAccount {
    public static CompletableFuture<GetBillingRoleAssignmentByEnrollmentAccountResult> invokeAsync(GetBillingRoleAssignmentByEnrollmentAccountArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:billing:getBillingRoleAssignmentByEnrollmentAccount", TypeShape.of(GetBillingRoleAssignmentByEnrollmentAccountResult.class), args == null ? GetBillingRoleAssignmentByEnrollmentAccountArgs.Empty : args, Utilities.withVersion(options));
    }
}
