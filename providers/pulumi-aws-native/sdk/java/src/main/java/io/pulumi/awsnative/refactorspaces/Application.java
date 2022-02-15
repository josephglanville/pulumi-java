// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.refactorspaces.ApplicationArgs;
import io.pulumi.awsnative.refactorspaces.enums.ApplicationProxyType;
import io.pulumi.awsnative.refactorspaces.outputs.ApplicationApiGatewayProxyInput;
import io.pulumi.awsnative.refactorspaces.outputs.ApplicationTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:refactorspaces:Application")
public class Application extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiGatewayId", type=String.class, parameters={})
    private Output<String> apiGatewayId;

    public Output<String> getApiGatewayId() {
        return this.apiGatewayId;
    }
    @OutputExport(name="apiGatewayProxy", type=ApplicationApiGatewayProxyInput.class, parameters={})
    private Output</* @Nullable */ ApplicationApiGatewayProxyInput> apiGatewayProxy;

    public Output</* @Nullable */ ApplicationApiGatewayProxyInput> getApiGatewayProxy() {
        return this.apiGatewayProxy;
    }
    @OutputExport(name="applicationIdentifier", type=String.class, parameters={})
    private Output<String> applicationIdentifier;

    public Output<String> getApplicationIdentifier() {
        return this.applicationIdentifier;
    }
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="environmentIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> environmentIdentifier;

    public Output</* @Nullable */ String> getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="nlbArn", type=String.class, parameters={})
    private Output<String> nlbArn;

    public Output<String> getNlbArn() {
        return this.nlbArn;
    }
    @OutputExport(name="nlbName", type=String.class, parameters={})
    private Output<String> nlbName;

    public Output<String> getNlbName() {
        return this.nlbName;
    }
    @OutputExport(name="proxyType", type=ApplicationProxyType.class, parameters={})
    private Output</* @Nullable */ ApplicationProxyType> proxyType;

    public Output</* @Nullable */ ApplicationProxyType> getProxyType() {
        return this.proxyType;
    }
    @OutputExport(name="proxyUrl", type=String.class, parameters={})
    private Output<String> proxyUrl;

    public Output<String> getProxyUrl() {
        return this.proxyUrl;
    }
    @OutputExport(name="stageName", type=String.class, parameters={})
    private Output<String> stageName;

    public Output<String> getStageName() {
        return this.stageName;
    }
    @OutputExport(name="tags", type=List.class, parameters={ApplicationTag.class})
    private Output</* @Nullable */ List<ApplicationTag>> tags;

    public Output</* @Nullable */ List<ApplicationTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcId;

    public Output</* @Nullable */ String> getVpcId() {
        return this.vpcId;
    }
    @OutputExport(name="vpcLinkId", type=String.class, parameters={})
    private Output<String> vpcLinkId;

    public Output<String> getVpcLinkId() {
        return this.vpcLinkId;
    }

    public Application(String name, @Nullable ApplicationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:refactorspaces:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Application(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:refactorspaces:Application", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Application get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, options);
    }
}