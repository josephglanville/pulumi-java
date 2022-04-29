// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Dns.inputs.SteeringPolicyRuleCaseAnswerDataArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SteeringPolicyRuleCaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final SteeringPolicyRuleCaseArgs Empty = new SteeringPolicyRuleCaseArgs();

    /**
     * An array of `SteeringPolicyPriorityAnswerData` objects.
     * 
     */
    @Import(name="answerDatas")
    private @Nullable Output<List<SteeringPolicyRuleCaseAnswerDataArgs>> answerDatas;

    /**
     * @return An array of `SteeringPolicyPriorityAnswerData` objects.
     * 
     */
    public Optional<Output<List<SteeringPolicyRuleCaseAnswerDataArgs>>> answerDatas() {
        return Optional.ofNullable(this.answerDatas);
    }

    /**
     * An expression that uses conditions at the time of a DNS query to indicate whether a case matches. Conditions may include the geographical location, IP subnet, or ASN the DNS query originated. **Example:** If you have an office that uses the subnet `192.0.2.0/24` you could use a `caseCondition` expression `query.client.subnet in (&#39;192.0.2.0/24&#39;)` to define a case that matches queries from that office.
     * 
     */
    @Import(name="caseCondition")
    private @Nullable Output<String> caseCondition;

    /**
     * @return An expression that uses conditions at the time of a DNS query to indicate whether a case matches. Conditions may include the geographical location, IP subnet, or ASN the DNS query originated. **Example:** If you have an office that uses the subnet `192.0.2.0/24` you could use a `caseCondition` expression `query.client.subnet in (&#39;192.0.2.0/24&#39;)` to define a case that matches queries from that office.
     * 
     */
    public Optional<Output<String>> caseCondition() {
        return Optional.ofNullable(this.caseCondition);
    }

    /**
     * The number of answers allowed to remain after the limit rule has been processed, keeping only the first of the remaining answers in the list. Example: If the `count` property is set to `2` and four answers remain before the limit rule is processed, only the first two answers in the list will remain after the limit rule has been processed.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return The number of answers allowed to remain after the limit rule has been processed, keeping only the first of the remaining answers in the list. Example: If the `count` property is set to `2` and four answers remain before the limit rule is processed, only the first two answers in the list will remain after the limit rule has been processed.
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    private SteeringPolicyRuleCaseArgs() {}

    private SteeringPolicyRuleCaseArgs(SteeringPolicyRuleCaseArgs $) {
        this.answerDatas = $.answerDatas;
        this.caseCondition = $.caseCondition;
        this.count = $.count;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SteeringPolicyRuleCaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SteeringPolicyRuleCaseArgs $;

        public Builder() {
            $ = new SteeringPolicyRuleCaseArgs();
        }

        public Builder(SteeringPolicyRuleCaseArgs defaults) {
            $ = new SteeringPolicyRuleCaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param answerDatas An array of `SteeringPolicyPriorityAnswerData` objects.
         * 
         * @return builder
         * 
         */
        public Builder answerDatas(@Nullable Output<List<SteeringPolicyRuleCaseAnswerDataArgs>> answerDatas) {
            $.answerDatas = answerDatas;
            return this;
        }

        /**
         * @param answerDatas An array of `SteeringPolicyPriorityAnswerData` objects.
         * 
         * @return builder
         * 
         */
        public Builder answerDatas(List<SteeringPolicyRuleCaseAnswerDataArgs> answerDatas) {
            return answerDatas(Output.of(answerDatas));
        }

        /**
         * @param answerDatas An array of `SteeringPolicyPriorityAnswerData` objects.
         * 
         * @return builder
         * 
         */
        public Builder answerDatas(SteeringPolicyRuleCaseAnswerDataArgs... answerDatas) {
            return answerDatas(List.of(answerDatas));
        }

        /**
         * @param caseCondition An expression that uses conditions at the time of a DNS query to indicate whether a case matches. Conditions may include the geographical location, IP subnet, or ASN the DNS query originated. **Example:** If you have an office that uses the subnet `192.0.2.0/24` you could use a `caseCondition` expression `query.client.subnet in (&#39;192.0.2.0/24&#39;)` to define a case that matches queries from that office.
         * 
         * @return builder
         * 
         */
        public Builder caseCondition(@Nullable Output<String> caseCondition) {
            $.caseCondition = caseCondition;
            return this;
        }

        /**
         * @param caseCondition An expression that uses conditions at the time of a DNS query to indicate whether a case matches. Conditions may include the geographical location, IP subnet, or ASN the DNS query originated. **Example:** If you have an office that uses the subnet `192.0.2.0/24` you could use a `caseCondition` expression `query.client.subnet in (&#39;192.0.2.0/24&#39;)` to define a case that matches queries from that office.
         * 
         * @return builder
         * 
         */
        public Builder caseCondition(String caseCondition) {
            return caseCondition(Output.of(caseCondition));
        }

        /**
         * @param count The number of answers allowed to remain after the limit rule has been processed, keeping only the first of the remaining answers in the list. Example: If the `count` property is set to `2` and four answers remain before the limit rule is processed, only the first two answers in the list will remain after the limit rule has been processed.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count The number of answers allowed to remain after the limit rule has been processed, keeping only the first of the remaining answers in the list. Example: If the `count` property is set to `2` and four answers remain before the limit rule is processed, only the first two answers in the list will remain after the limit rule has been processed.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        public SteeringPolicyRuleCaseArgs build() {
            return $;
        }
    }

}
