// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.route53.enums.RecordType;
import io.pulumi.aws.route53.inputs.RecordAliasArgs;
import io.pulumi.aws.route53.inputs.RecordFailoverRoutingPolicyArgs;
import io.pulumi.aws.route53.inputs.RecordGeolocationRoutingPolicyArgs;
import io.pulumi.aws.route53.inputs.RecordLatencyRoutingPolicyArgs;
import io.pulumi.aws.route53.inputs.RecordWeightedRoutingPolicyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RecordArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecordArgs Empty = new RecordArgs();

    /**
     * An alias block. Conflicts with `ttl` & `records`.
     * Alias record documented below.
     * 
     */
    @Import(name="aliases")
      private final @Nullable Output<List<RecordAliasArgs>> aliases;

    public Output<List<RecordAliasArgs>> getAliases() {
        return this.aliases == null ? Output.empty() : this.aliases;
    }

    /**
     * Allow creation of this record to overwrite an existing record, if any. This does not affect the ability to update the record using this provider and does not prevent other resources within this provider or manual Route 53 changes outside this provider from overwriting this record. `false` by default. This configuration is not recommended for most environments.
     * 
     */
    @Import(name="allowOverwrite")
      private final @Nullable Output<Boolean> allowOverwrite;

    public Output<Boolean> getAllowOverwrite() {
        return this.allowOverwrite == null ? Output.empty() : this.allowOverwrite;
    }

    /**
     * A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
     * 
     */
    @Import(name="failoverRoutingPolicies")
      private final @Nullable Output<List<RecordFailoverRoutingPolicyArgs>> failoverRoutingPolicies;

    public Output<List<RecordFailoverRoutingPolicyArgs>> getFailoverRoutingPolicies() {
        return this.failoverRoutingPolicies == null ? Output.empty() : this.failoverRoutingPolicies;
    }

    /**
     * A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
     * 
     */
    @Import(name="geolocationRoutingPolicies")
      private final @Nullable Output<List<RecordGeolocationRoutingPolicyArgs>> geolocationRoutingPolicies;

    public Output<List<RecordGeolocationRoutingPolicyArgs>> getGeolocationRoutingPolicies() {
        return this.geolocationRoutingPolicies == null ? Output.empty() : this.geolocationRoutingPolicies;
    }

    /**
     * The health check the record should be associated with.
     * 
     */
    @Import(name="healthCheckId")
      private final @Nullable Output<String> healthCheckId;

    public Output<String> getHealthCheckId() {
        return this.healthCheckId == null ? Output.empty() : this.healthCheckId;
    }

    /**
     * A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
     * 
     */
    @Import(name="latencyRoutingPolicies")
      private final @Nullable Output<List<RecordLatencyRoutingPolicyArgs>> latencyRoutingPolicies;

    public Output<List<RecordLatencyRoutingPolicyArgs>> getLatencyRoutingPolicies() {
        return this.latencyRoutingPolicies == null ? Output.empty() : this.latencyRoutingPolicies;
    }

    /**
     * Set to `true` to indicate a multivalue answer routing policy. Conflicts with any other routing policy.
     * 
     */
    @Import(name="multivalueAnswerRoutingPolicy")
      private final @Nullable Output<Boolean> multivalueAnswerRoutingPolicy;

    public Output<Boolean> getMultivalueAnswerRoutingPolicy() {
        return this.multivalueAnswerRoutingPolicy == null ? Output.empty() : this.multivalueAnswerRoutingPolicy;
    }

    /**
     * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * A string list of records. To specify a single record value longer than 255 characters such as a TXT record for DKIM, add `\"\"` inside the configuration string (e.g. `"first255characters\"\"morecharacters"`).
     * 
     */
    @Import(name="records")
      private final @Nullable Output<List<String>> records;

    public Output<List<String>> getRecords() {
        return this.records == null ? Output.empty() : this.records;
    }

    /**
     * Unique identifier to differentiate records with routing policies from one another. Required if using `failover`, `geolocation`, `latency`, or `weighted` routing policies documented below.
     * 
     */
    @Import(name="setIdentifier")
      private final @Nullable Output<String> setIdentifier;

    public Output<String> getSetIdentifier() {
        return this.setIdentifier == null ? Output.empty() : this.setIdentifier;
    }

    /**
     * The TTL of the record.
     * 
     */
    @Import(name="ttl")
      private final @Nullable Output<Integer> ttl;

    public Output<Integer> getTtl() {
        return this.ttl == null ? Output.empty() : this.ttl;
    }

    /**
     * `PRIMARY` or `SECONDARY`. A `PRIMARY` record will be served if its healthcheck is passing, otherwise the `SECONDARY` will be served. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html#dns-failover-failover-rrsets
     * 
     */
    @Import(name="type", required=true)
      private final Output<Either<String,RecordType>> type;

    public Output<Either<String,RecordType>> getType() {
        return this.type;
    }

    /**
     * A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
     * 
     */
    @Import(name="weightedRoutingPolicies")
      private final @Nullable Output<List<RecordWeightedRoutingPolicyArgs>> weightedRoutingPolicies;

    public Output<List<RecordWeightedRoutingPolicyArgs>> getWeightedRoutingPolicies() {
        return this.weightedRoutingPolicies == null ? Output.empty() : this.weightedRoutingPolicies;
    }

    /**
     * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See `resource_elb.zone_id` for example.
     * 
     */
    @Import(name="zoneId", required=true)
      private final Output<String> zoneId;

    public Output<String> getZoneId() {
        return this.zoneId;
    }

    public RecordArgs(
        @Nullable Output<List<RecordAliasArgs>> aliases,
        @Nullable Output<Boolean> allowOverwrite,
        @Nullable Output<List<RecordFailoverRoutingPolicyArgs>> failoverRoutingPolicies,
        @Nullable Output<List<RecordGeolocationRoutingPolicyArgs>> geolocationRoutingPolicies,
        @Nullable Output<String> healthCheckId,
        @Nullable Output<List<RecordLatencyRoutingPolicyArgs>> latencyRoutingPolicies,
        @Nullable Output<Boolean> multivalueAnswerRoutingPolicy,
        Output<String> name,
        @Nullable Output<List<String>> records,
        @Nullable Output<String> setIdentifier,
        @Nullable Output<Integer> ttl,
        Output<Either<String,RecordType>> type,
        @Nullable Output<List<RecordWeightedRoutingPolicyArgs>> weightedRoutingPolicies,
        Output<String> zoneId) {
        this.aliases = aliases;
        this.allowOverwrite = allowOverwrite;
        this.failoverRoutingPolicies = failoverRoutingPolicies;
        this.geolocationRoutingPolicies = geolocationRoutingPolicies;
        this.healthCheckId = healthCheckId;
        this.latencyRoutingPolicies = latencyRoutingPolicies;
        this.multivalueAnswerRoutingPolicy = multivalueAnswerRoutingPolicy;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.records = records;
        this.setIdentifier = setIdentifier;
        this.ttl = ttl;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.weightedRoutingPolicies = weightedRoutingPolicies;
        this.zoneId = Objects.requireNonNull(zoneId, "expected parameter 'zoneId' to be non-null");
    }

    private RecordArgs() {
        this.aliases = Output.empty();
        this.allowOverwrite = Output.empty();
        this.failoverRoutingPolicies = Output.empty();
        this.geolocationRoutingPolicies = Output.empty();
        this.healthCheckId = Output.empty();
        this.latencyRoutingPolicies = Output.empty();
        this.multivalueAnswerRoutingPolicy = Output.empty();
        this.name = Output.empty();
        this.records = Output.empty();
        this.setIdentifier = Output.empty();
        this.ttl = Output.empty();
        this.type = Output.empty();
        this.weightedRoutingPolicies = Output.empty();
        this.zoneId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RecordAliasArgs>> aliases;
        private @Nullable Output<Boolean> allowOverwrite;
        private @Nullable Output<List<RecordFailoverRoutingPolicyArgs>> failoverRoutingPolicies;
        private @Nullable Output<List<RecordGeolocationRoutingPolicyArgs>> geolocationRoutingPolicies;
        private @Nullable Output<String> healthCheckId;
        private @Nullable Output<List<RecordLatencyRoutingPolicyArgs>> latencyRoutingPolicies;
        private @Nullable Output<Boolean> multivalueAnswerRoutingPolicy;
        private Output<String> name;
        private @Nullable Output<List<String>> records;
        private @Nullable Output<String> setIdentifier;
        private @Nullable Output<Integer> ttl;
        private Output<Either<String,RecordType>> type;
        private @Nullable Output<List<RecordWeightedRoutingPolicyArgs>> weightedRoutingPolicies;
        private Output<String> zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.allowOverwrite = defaults.allowOverwrite;
    	      this.failoverRoutingPolicies = defaults.failoverRoutingPolicies;
    	      this.geolocationRoutingPolicies = defaults.geolocationRoutingPolicies;
    	      this.healthCheckId = defaults.healthCheckId;
    	      this.latencyRoutingPolicies = defaults.latencyRoutingPolicies;
    	      this.multivalueAnswerRoutingPolicy = defaults.multivalueAnswerRoutingPolicy;
    	      this.name = defaults.name;
    	      this.records = defaults.records;
    	      this.setIdentifier = defaults.setIdentifier;
    	      this.ttl = defaults.ttl;
    	      this.type = defaults.type;
    	      this.weightedRoutingPolicies = defaults.weightedRoutingPolicies;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder aliases(@Nullable Output<List<RecordAliasArgs>> aliases) {
            this.aliases = aliases;
            return this;
        }
        public Builder aliases(@Nullable List<RecordAliasArgs> aliases) {
            this.aliases = Output.ofNullable(aliases);
            return this;
        }
        public Builder aliases(RecordAliasArgs... aliases) {
            return aliases(List.of(aliases));
        }
        public Builder allowOverwrite(@Nullable Output<Boolean> allowOverwrite) {
            this.allowOverwrite = allowOverwrite;
            return this;
        }
        public Builder allowOverwrite(@Nullable Boolean allowOverwrite) {
            this.allowOverwrite = Output.ofNullable(allowOverwrite);
            return this;
        }
        public Builder failoverRoutingPolicies(@Nullable Output<List<RecordFailoverRoutingPolicyArgs>> failoverRoutingPolicies) {
            this.failoverRoutingPolicies = failoverRoutingPolicies;
            return this;
        }
        public Builder failoverRoutingPolicies(@Nullable List<RecordFailoverRoutingPolicyArgs> failoverRoutingPolicies) {
            this.failoverRoutingPolicies = Output.ofNullable(failoverRoutingPolicies);
            return this;
        }
        public Builder failoverRoutingPolicies(RecordFailoverRoutingPolicyArgs... failoverRoutingPolicies) {
            return failoverRoutingPolicies(List.of(failoverRoutingPolicies));
        }
        public Builder geolocationRoutingPolicies(@Nullable Output<List<RecordGeolocationRoutingPolicyArgs>> geolocationRoutingPolicies) {
            this.geolocationRoutingPolicies = geolocationRoutingPolicies;
            return this;
        }
        public Builder geolocationRoutingPolicies(@Nullable List<RecordGeolocationRoutingPolicyArgs> geolocationRoutingPolicies) {
            this.geolocationRoutingPolicies = Output.ofNullable(geolocationRoutingPolicies);
            return this;
        }
        public Builder geolocationRoutingPolicies(RecordGeolocationRoutingPolicyArgs... geolocationRoutingPolicies) {
            return geolocationRoutingPolicies(List.of(geolocationRoutingPolicies));
        }
        public Builder healthCheckId(@Nullable Output<String> healthCheckId) {
            this.healthCheckId = healthCheckId;
            return this;
        }
        public Builder healthCheckId(@Nullable String healthCheckId) {
            this.healthCheckId = Output.ofNullable(healthCheckId);
            return this;
        }
        public Builder latencyRoutingPolicies(@Nullable Output<List<RecordLatencyRoutingPolicyArgs>> latencyRoutingPolicies) {
            this.latencyRoutingPolicies = latencyRoutingPolicies;
            return this;
        }
        public Builder latencyRoutingPolicies(@Nullable List<RecordLatencyRoutingPolicyArgs> latencyRoutingPolicies) {
            this.latencyRoutingPolicies = Output.ofNullable(latencyRoutingPolicies);
            return this;
        }
        public Builder latencyRoutingPolicies(RecordLatencyRoutingPolicyArgs... latencyRoutingPolicies) {
            return latencyRoutingPolicies(List.of(latencyRoutingPolicies));
        }
        public Builder multivalueAnswerRoutingPolicy(@Nullable Output<Boolean> multivalueAnswerRoutingPolicy) {
            this.multivalueAnswerRoutingPolicy = multivalueAnswerRoutingPolicy;
            return this;
        }
        public Builder multivalueAnswerRoutingPolicy(@Nullable Boolean multivalueAnswerRoutingPolicy) {
            this.multivalueAnswerRoutingPolicy = Output.ofNullable(multivalueAnswerRoutingPolicy);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder records(@Nullable Output<List<String>> records) {
            this.records = records;
            return this;
        }
        public Builder records(@Nullable List<String> records) {
            this.records = Output.ofNullable(records);
            return this;
        }
        public Builder records(String... records) {
            return records(List.of(records));
        }
        public Builder setIdentifier(@Nullable Output<String> setIdentifier) {
            this.setIdentifier = setIdentifier;
            return this;
        }
        public Builder setIdentifier(@Nullable String setIdentifier) {
            this.setIdentifier = Output.ofNullable(setIdentifier);
            return this;
        }
        public Builder ttl(@Nullable Output<Integer> ttl) {
            this.ttl = ttl;
            return this;
        }
        public Builder ttl(@Nullable Integer ttl) {
            this.ttl = Output.ofNullable(ttl);
            return this;
        }
        public Builder type(Output<Either<String,RecordType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(Either<String,RecordType> type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder weightedRoutingPolicies(@Nullable Output<List<RecordWeightedRoutingPolicyArgs>> weightedRoutingPolicies) {
            this.weightedRoutingPolicies = weightedRoutingPolicies;
            return this;
        }
        public Builder weightedRoutingPolicies(@Nullable List<RecordWeightedRoutingPolicyArgs> weightedRoutingPolicies) {
            this.weightedRoutingPolicies = Output.ofNullable(weightedRoutingPolicies);
            return this;
        }
        public Builder weightedRoutingPolicies(RecordWeightedRoutingPolicyArgs... weightedRoutingPolicies) {
            return weightedRoutingPolicies(List.of(weightedRoutingPolicies));
        }
        public Builder zoneId(Output<String> zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }
        public Builder zoneId(String zoneId) {
            this.zoneId = Output.of(Objects.requireNonNull(zoneId));
            return this;
        }        public RecordArgs build() {
            return new RecordArgs(aliases, allowOverwrite, failoverRoutingPolicies, geolocationRoutingPolicies, healthCheckId, latencyRoutingPolicies, multivalueAnswerRoutingPolicy, name, records, setIdentifier, ttl, type, weightedRoutingPolicies, zoneId);
        }
    }
}
