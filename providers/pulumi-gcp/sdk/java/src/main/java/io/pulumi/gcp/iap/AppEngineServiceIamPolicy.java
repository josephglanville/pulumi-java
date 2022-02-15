// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.iap.AppEngineServiceIamPolicyArgs;
import io.pulumi.gcp.iap.inputs.AppEngineServiceIamPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:iap/appEngineServiceIamPolicy:AppEngineServiceIamPolicy")
public class AppEngineServiceIamPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    public Output<String> getAppId() {
        return this.appId;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="service", type=String.class, parameters={})
    private Output<String> service;

    public Output<String> getService() {
        return this.service;
    }

    public AppEngineServiceIamPolicy(String name, AppEngineServiceIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iap/appEngineServiceIamPolicy:AppEngineServiceIamPolicy", name, args == null ? AppEngineServiceIamPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AppEngineServiceIamPolicy(String name, Input<String> id, @Nullable AppEngineServiceIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iap/appEngineServiceIamPolicy:AppEngineServiceIamPolicy", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static AppEngineServiceIamPolicy get(String name, Input<String> id, @Nullable AppEngineServiceIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AppEngineServiceIamPolicy(name, id, state, options);
    }
}