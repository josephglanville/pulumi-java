// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.m365securityandcompliance.inputs.GetprivateLinkServicesForMIPPolicySyncArgs;
import io.pulumi.azurenative.m365securityandcompliance.outputs.GetprivateLinkServicesForMIPPolicySyncResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetprivateLinkServicesForMIPPolicySync {
    public static CompletableFuture<GetprivateLinkServicesForMIPPolicySyncResult> invokeAsync(GetprivateLinkServicesForMIPPolicySyncArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:m365securityandcompliance:getprivateLinkServicesForMIPPolicySync", TypeShape.of(GetprivateLinkServicesForMIPPolicySyncResult.class), args == null ? GetprivateLinkServicesForMIPPolicySyncArgs.Empty : args, Utilities.withVersion(options));
    }
}
