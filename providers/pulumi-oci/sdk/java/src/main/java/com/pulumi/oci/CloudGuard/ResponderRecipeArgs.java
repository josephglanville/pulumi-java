// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.CloudGuard.inputs.ResponderRecipeResponderRuleArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponderRecipeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponderRecipeArgs Empty = new ResponderRecipeArgs();

    /**
     * (Updatable) Compartment Identifier
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return (Updatable) Compartment Identifier
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) ResponderRecipe Description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Updatable) ResponderRecipe Description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Updatable) ResponderRecipe Display Name
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return (Updatable) ResponderRecipe Display Name
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * (Updatable) Responder Rules to override from source responder recipe
     * 
     */
    @Import(name="responderRules")
    private @Nullable Output<List<ResponderRecipeResponderRuleArgs>> responderRules;

    /**
     * @return (Updatable) Responder Rules to override from source responder recipe
     * 
     */
    public Optional<Output<List<ResponderRecipeResponderRuleArgs>>> responderRules() {
        return Optional.ofNullable(this.responderRules);
    }

    /**
     * The id of the source responder recipe.
     * 
     */
    @Import(name="sourceResponderRecipeId", required=true)
    private Output<String> sourceResponderRecipeId;

    /**
     * @return The id of the source responder recipe.
     * 
     */
    public Output<String> sourceResponderRecipeId() {
        return this.sourceResponderRecipeId;
    }

    private ResponderRecipeArgs() {}

    private ResponderRecipeArgs(ResponderRecipeArgs $) {
        this.compartmentId = $.compartmentId;
        this.definedTags = $.definedTags;
        this.description = $.description;
        this.displayName = $.displayName;
        this.freeformTags = $.freeformTags;
        this.responderRules = $.responderRules;
        this.sourceResponderRecipeId = $.sourceResponderRecipeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponderRecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponderRecipeArgs $;

        public Builder() {
            $ = new ResponderRecipeArgs();
        }

        public Builder(ResponderRecipeArgs defaults) {
            $ = new ResponderRecipeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) Compartment Identifier
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) Compartment Identifier
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param description (Updatable) ResponderRecipe Description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) ResponderRecipe Description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName (Updatable) ResponderRecipe Display Name
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) ResponderRecipe Display Name
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param responderRules (Updatable) Responder Rules to override from source responder recipe
         * 
         * @return builder
         * 
         */
        public Builder responderRules(@Nullable Output<List<ResponderRecipeResponderRuleArgs>> responderRules) {
            $.responderRules = responderRules;
            return this;
        }

        /**
         * @param responderRules (Updatable) Responder Rules to override from source responder recipe
         * 
         * @return builder
         * 
         */
        public Builder responderRules(List<ResponderRecipeResponderRuleArgs> responderRules) {
            return responderRules(Output.of(responderRules));
        }

        /**
         * @param responderRules (Updatable) Responder Rules to override from source responder recipe
         * 
         * @return builder
         * 
         */
        public Builder responderRules(ResponderRecipeResponderRuleArgs... responderRules) {
            return responderRules(List.of(responderRules));
        }

        /**
         * @param sourceResponderRecipeId The id of the source responder recipe.
         * 
         * @return builder
         * 
         */
        public Builder sourceResponderRecipeId(Output<String> sourceResponderRecipeId) {
            $.sourceResponderRecipeId = sourceResponderRecipeId;
            return this;
        }

        /**
         * @param sourceResponderRecipeId The id of the source responder recipe.
         * 
         * @return builder
         * 
         */
        public Builder sourceResponderRecipeId(String sourceResponderRecipeId) {
            return sourceResponderRecipeId(Output.of(sourceResponderRecipeId));
        }

        public ResponderRecipeArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.sourceResponderRecipeId = Objects.requireNonNull($.sourceResponderRecipeId, "expected parameter 'sourceResponderRecipeId' to be non-null");
            return $;
        }
    }

}
