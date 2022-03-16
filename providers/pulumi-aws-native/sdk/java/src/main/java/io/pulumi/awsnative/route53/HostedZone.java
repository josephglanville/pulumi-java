// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53.HostedZoneArgs;
import io.pulumi.awsnative.route53.outputs.HostedZoneConfig;
import io.pulumi.awsnative.route53.outputs.HostedZoneQueryLoggingConfig;
import io.pulumi.awsnative.route53.outputs.HostedZoneTag;
import io.pulumi.awsnative.route53.outputs.HostedZoneVPC;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Route53::HostedZone.
 * 
 */
@ResourceType(type="aws-native:route53:HostedZone")
public class HostedZone extends io.pulumi.resources.CustomResource {
    @Export(name="hostedZoneConfig", type=HostedZoneConfig.class, parameters={})
    private Output</* @Nullable */ HostedZoneConfig> hostedZoneConfig;

    public Output</* @Nullable */ HostedZoneConfig> getHostedZoneConfig() {
        return this.hostedZoneConfig;
    }
    /**
     * Adds, edits, or deletes tags for a health check or a hosted zone.
     * 
     * For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
     * 
     */
    @Export(name="hostedZoneTags", type=List.class, parameters={HostedZoneTag.class})
    private Output</* @Nullable */ List<HostedZoneTag>> hostedZoneTags;

    /**
     * @return Adds, edits, or deletes tags for a health check or a hosted zone.
     * 
     * For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
     * 
     */
    public Output</* @Nullable */ List<HostedZoneTag>> getHostedZoneTags() {
        return this.hostedZoneTags;
    }
    /**
     * The name of the domain. Specify a fully qualified domain name, for example, www.example.com. The trailing dot is optional; Amazon Route 53 assumes that the domain name is fully qualified. This means that Route 53 treats www.example.com (without a trailing dot) and www.example.com. (with a trailing dot) as identical.
     * 
     * If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If your domain name is registered with a registrar other than Route 53, change the name servers for your domain to the set of NameServers that are returned by the Fn::GetAtt intrinsic function.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the domain. Specify a fully qualified domain name, for example, www.example.com. The trailing dot is optional; Amazon Route 53 assumes that the domain name is fully qualified. This means that Route 53 treats www.example.com (without a trailing dot) and www.example.com. (with a trailing dot) as identical.
     * 
     * If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If your domain name is registered with a registrar other than Route 53, change the name servers for your domain to the set of NameServers that are returned by the Fn::GetAtt intrinsic function.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @Export(name="nameServers", type=List.class, parameters={String.class})
    private Output<List<String>> nameServers;

    public Output<List<String>> getNameServers() {
        return this.nameServers;
    }
    @Export(name="queryLoggingConfig", type=HostedZoneQueryLoggingConfig.class, parameters={})
    private Output</* @Nullable */ HostedZoneQueryLoggingConfig> queryLoggingConfig;

    public Output</* @Nullable */ HostedZoneQueryLoggingConfig> getQueryLoggingConfig() {
        return this.queryLoggingConfig;
    }
    /**
     * A complex type that contains information about the VPCs that are associated with the specified hosted zone.
     * 
     */
    @Export(name="vPCs", type=List.class, parameters={HostedZoneVPC.class})
    private Output</* @Nullable */ List<HostedZoneVPC>> vPCs;

    /**
     * @return A complex type that contains information about the VPCs that are associated with the specified hosted zone.
     * 
     */
    public Output</* @Nullable */ List<HostedZoneVPC>> getVPCs() {
        return this.vPCs;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable HostedZoneArgs.Builder a);
    }
    private static io.pulumi.awsnative.route53.HostedZoneArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.route53.HostedZoneArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public HostedZone(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HostedZone(String name) {
        this(name, HostedZoneArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostedZone(String name, @Nullable HostedZoneArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostedZone(String name, @Nullable HostedZoneArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53:HostedZone", name, args == null ? HostedZoneArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private HostedZone(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53:HostedZone", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static HostedZone get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HostedZone(name, id, options);
    }
}
