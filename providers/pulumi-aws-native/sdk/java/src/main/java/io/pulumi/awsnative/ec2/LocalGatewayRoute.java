// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.LocalGatewayRouteArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:ec2:LocalGatewayRoute")
public class LocalGatewayRoute extends io.pulumi.resources.CustomResource {
    @OutputExport(name="destinationCidrBlock", type=String.class, parameters={})
    private Output<String> destinationCidrBlock;

    public Output<String> getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }
    @OutputExport(name="localGatewayRouteTableId", type=String.class, parameters={})
    private Output<String> localGatewayRouteTableId;

    public Output<String> getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }
    @OutputExport(name="localGatewayVirtualInterfaceGroupId", type=String.class, parameters={})
    private Output<String> localGatewayVirtualInterfaceGroupId;

    public Output<String> getLocalGatewayVirtualInterfaceGroupId() {
        return this.localGatewayVirtualInterfaceGroupId;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public LocalGatewayRoute(String name, LocalGatewayRouteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:LocalGatewayRoute", name, args == null ? LocalGatewayRouteArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LocalGatewayRoute(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:LocalGatewayRoute", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static LocalGatewayRoute get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LocalGatewayRoute(name, id, options);
    }
}