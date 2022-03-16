// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.wisdom.KnowledgeBaseArgs;
import io.pulumi.awsnative.wisdom.enums.KnowledgeBaseType;
import io.pulumi.awsnative.wisdom.outputs.KnowledgeBaseRenderingConfiguration;
import io.pulumi.awsnative.wisdom.outputs.KnowledgeBaseServerSideEncryptionConfiguration;
import io.pulumi.awsnative.wisdom.outputs.KnowledgeBaseSourceConfiguration;
import io.pulumi.awsnative.wisdom.outputs.KnowledgeBaseTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Definition of AWS::Wisdom::KnowledgeBase Resource Type
 * 
 */
@ResourceType(type="aws-native:wisdom:KnowledgeBase")
public class KnowledgeBase extends io.pulumi.resources.CustomResource {
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @Export(name="knowledgeBaseArn", type=String.class, parameters={})
    private Output<String> knowledgeBaseArn;

    public Output<String> getKnowledgeBaseArn() {
        return this.knowledgeBaseArn;
    }
    @Export(name="knowledgeBaseId", type=String.class, parameters={})
    private Output<String> knowledgeBaseId;

    public Output<String> getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }
    @Export(name="knowledgeBaseType", type=KnowledgeBaseType.class, parameters={})
    private Output<KnowledgeBaseType> knowledgeBaseType;

    public Output<KnowledgeBaseType> getKnowledgeBaseType() {
        return this.knowledgeBaseType;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @Export(name="renderingConfiguration", type=KnowledgeBaseRenderingConfiguration.class, parameters={})
    private Output</* @Nullable */ KnowledgeBaseRenderingConfiguration> renderingConfiguration;

    public Output</* @Nullable */ KnowledgeBaseRenderingConfiguration> getRenderingConfiguration() {
        return this.renderingConfiguration;
    }
    @Export(name="serverSideEncryptionConfiguration", type=KnowledgeBaseServerSideEncryptionConfiguration.class, parameters={})
    private Output</* @Nullable */ KnowledgeBaseServerSideEncryptionConfiguration> serverSideEncryptionConfiguration;

    public Output</* @Nullable */ KnowledgeBaseServerSideEncryptionConfiguration> getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }
    @Export(name="sourceConfiguration", type=KnowledgeBaseSourceConfiguration.class, parameters={})
    private Output</* @Nullable */ KnowledgeBaseSourceConfiguration> sourceConfiguration;

    public Output</* @Nullable */ KnowledgeBaseSourceConfiguration> getSourceConfiguration() {
        return this.sourceConfiguration;
    }
    @Export(name="tags", type=List.class, parameters={KnowledgeBaseTag.class})
    private Output</* @Nullable */ List<KnowledgeBaseTag>> tags;

    public Output</* @Nullable */ List<KnowledgeBaseTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(KnowledgeBaseArgs.Builder a);
    }
    private static io.pulumi.awsnative.wisdom.KnowledgeBaseArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.wisdom.KnowledgeBaseArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public KnowledgeBase(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KnowledgeBase(String name) {
        this(name, KnowledgeBaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KnowledgeBase(String name, KnowledgeBaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KnowledgeBase(String name, KnowledgeBaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:wisdom:KnowledgeBase", name, args == null ? KnowledgeBaseArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private KnowledgeBase(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:wisdom:KnowledgeBase", name, null, makeResourceOptions(options, id));
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
    public static KnowledgeBase get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new KnowledgeBase(name, id, options);
    }
}
