// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.SentinelOnboardingStateArgs;
import io.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:securityinsights:SentinelOnboardingState")
public class SentinelOnboardingState extends io.pulumi.resources.CustomResource {
    @OutputExport(name="customerManagedKey", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> customerManagedKey;

    public Output</* @Nullable */ Boolean> getCustomerManagedKey() {
        return this.customerManagedKey;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public SentinelOnboardingState(String name, SentinelOnboardingStateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:SentinelOnboardingState", name, args == null ? SentinelOnboardingStateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SentinelOnboardingState(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:SentinelOnboardingState", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210301preview:SentinelOnboardingState").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210901preview:SentinelOnboardingState").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SentinelOnboardingState get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SentinelOnboardingState(name, id, options);
    }
}
