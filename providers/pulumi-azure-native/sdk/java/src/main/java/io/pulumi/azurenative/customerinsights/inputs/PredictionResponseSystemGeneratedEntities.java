// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * System generated entities.
 * 
 */
public final class PredictionResponseSystemGeneratedEntities extends io.pulumi.resources.InvokeArgs {

    public static final PredictionResponseSystemGeneratedEntities Empty = new PredictionResponseSystemGeneratedEntities();

    /**
     * Generated interaction types.
     * 
     */
    @InputImport(name="generatedInteractionTypes")
      private final @Nullable List<String> generatedInteractionTypes;

    public List<String> getGeneratedInteractionTypes() {
        return this.generatedInteractionTypes == null ? List.of() : this.generatedInteractionTypes;
    }

    /**
     * Generated KPIs.
     * 
     */
    @InputImport(name="generatedKpis")
      private final @Nullable Map<String,String> generatedKpis;

    public Map<String,String> getGeneratedKpis() {
        return this.generatedKpis == null ? Map.of() : this.generatedKpis;
    }

    /**
     * Generated links.
     * 
     */
    @InputImport(name="generatedLinks")
      private final @Nullable List<String> generatedLinks;

    public List<String> getGeneratedLinks() {
        return this.generatedLinks == null ? List.of() : this.generatedLinks;
    }

    public PredictionResponseSystemGeneratedEntities(
        @Nullable List<String> generatedInteractionTypes,
        @Nullable Map<String,String> generatedKpis,
        @Nullable List<String> generatedLinks) {
        this.generatedInteractionTypes = generatedInteractionTypes;
        this.generatedKpis = generatedKpis;
        this.generatedLinks = generatedLinks;
    }

    private PredictionResponseSystemGeneratedEntities() {
        this.generatedInteractionTypes = List.of();
        this.generatedKpis = Map.of();
        this.generatedLinks = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PredictionResponseSystemGeneratedEntities defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> generatedInteractionTypes;
        private @Nullable Map<String,String> generatedKpis;
        private @Nullable List<String> generatedLinks;

        public Builder() {
    	      // Empty
        }

        public Builder(PredictionResponseSystemGeneratedEntities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.generatedInteractionTypes = defaults.generatedInteractionTypes;
    	      this.generatedKpis = defaults.generatedKpis;
    	      this.generatedLinks = defaults.generatedLinks;
        }

        public Builder setGeneratedInteractionTypes(@Nullable List<String> generatedInteractionTypes) {
            this.generatedInteractionTypes = generatedInteractionTypes;
            return this;
        }

        public Builder setGeneratedKpis(@Nullable Map<String,String> generatedKpis) {
            this.generatedKpis = generatedKpis;
            return this;
        }

        public Builder setGeneratedLinks(@Nullable List<String> generatedLinks) {
            this.generatedLinks = generatedLinks;
            return this;
        }
        public PredictionResponseSystemGeneratedEntities build() {
            return new PredictionResponseSystemGeneratedEntities(generatedInteractionTypes, generatedKpis, generatedLinks);
        }
    }
}
